# TIPS EXAMEN LOGONGAS
## Pasos

Bajarse lo último de las 3 ramas
```bash
git fetch --prune                         # Actualiza todas las ramas y borra las que no existen en el remoto
git switch develop                        # Cambia a la rama develop y mergea con el remoto
git merge --ff-only origin/develop 
git switch release                        # Cambia a la rama release ymergea con el remoto
git merge --ff-only origin/release 
git switch master                         # Cambia a la rama master y mergea con el remoto
git merge --ff-only origin/master 
git switch develop
```