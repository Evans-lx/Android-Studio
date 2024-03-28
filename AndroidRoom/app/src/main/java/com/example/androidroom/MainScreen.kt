package com.example.androidroom

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.graphics.Color
@Composable
fun MainScreen(subjectViewModel: SubjectViewModel) {
    val subjects by subjectViewModel.allSubjects.observeAsState(emptyList())
    val selectedSubject = remember { mutableStateOf<Subject?>(null) }
    val insertDialog = remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Button(onClick = { insertDialog.value = true }) {
            Text("Add Subject")
        }
        LazyColumn {
            itemsIndexed(subjects) { index, subject ->
                SubjectItem(
                    subject = subject,
                    onEdit = { selectedSubject.value = subject },
                    onDelete = { subjectViewModel.deleteSubject(subject) }
                )
                Divider(color = Color.Gray, thickness = 5.dp)
            }
        }
    }
    if (insertDialog.value) {
        InsertSubjectDialog(
            onDismiss = { insertDialog.value = false },
            onSave = { subjectName ->
                subjectViewModel.insertSubject(Subject(name = subjectName))
            }
        )
    }
    selectedSubject.value?.let { subject ->
        EditSubjectDialog(
            subject = subject,
            onDismiss = { selectedSubject.value = null },
            onSave = { updatedSubject ->
                subjectViewModel.updateSubject(updatedSubject)
                selectedSubject.value = null
            }
        )
    }
}
@Composable
fun InsertSubjectDialog(
    onDismiss: () -> Unit,
    onSave: (String) -> Unit
) {
    var subjectName by remember { mutableStateOf("") }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Add Subject") },
        confirmButton = {
            Button(
                onClick = {
                    onSave(subjectName)
                    onDismiss()
                }
            ) {
                Text("Save")
            }
        },
        dismissButton = {
            Button(onClick = onDismiss) {
                Text("Cancel")
            }
        },
        text = {
            TextField(
                value = subjectName,
                onValueChange = { subjectName = it },
                modifier = Modifier.fillMaxWidth()
            )
        }
    )
}
@Composable
fun EditSubjectDialog(subject: Subject, onDismiss: () -> Unit, onSave: (Subject) -> Unit)
{
    var editedSubject by remember { mutableStateOf(subject) }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Edit Subject") },
        confirmButton = {
            Button(
                onClick = {
                    onSave(editedSubject)
                    onDismiss()
                }
            ) {
                Text("Save")
            }
        },
        dismissButton = {
            Button(onClick = onDismiss) {
                Text("Cancel")
            }
        },
        text = {
            TextField(
                value = editedSubject.name.toString(),
                onValueChange = { editedSubject = editedSubject.copy(name = it) },
                modifier = Modifier.fillMaxWidth()
            )
        }
    )
}
