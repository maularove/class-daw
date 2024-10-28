# Control de Versiones

```js
| Espacio de Trabajo       | ➔ Staged in Area                           | ➔ Repositorio           |
  (workspace)                 (modificaciones añadidas a subir)                                    
```

## 1. Instalando Git

- indicar `nombre` y `correo`
```js
git config --global user.name "juan"
git config --global user.email juan@micorreo.com
```

- configurar proxy (si estás en insti)
```js
git config --global http.proxy http://172.16.0.9:8080
git config --global https.proxy http://172.16.0.9:8080
```

- instalar git en linux (last version)
```js
sudo add-apt-repository ppa:git-core/ppa
sudo apt update
sudo apt install git
```

---
<br>

## 2. Inicio de Git

- iniciar directorio para usar git
```js
git init
```

- descargar repo que ya existe
```js
git clone https://github.com/lgonzalezmislata/prueba.git
```

---
<br>

## 3. Configuración

`.gitkeep` => 
<br>
archivo vacío que permite mantener un directorio vacío en el repositorio

`.gitignore` => 
<br>
archivo que especifica que archivos queremos que **_git_** ignore

---
<br>

## 4. Estados de un fichero

`untracked` _o archivos sin seguimientos_ => 
<br>
ficheros existen área de trabajo ✔️ / en git ❌
<br>

`staged` _o cambios a ser confirmados_ =>
<br> 
ficheros modificados que se añadirán al siguiente commit
<br>

`commited` => 
<br>
ficheros guardados último commit / no han sido modificados desde este
<br>

`modified` _o cambios no rastreados para el commit_ => 
<br>
ficheros modificados desde el último commit / aún no añadidos para el prox commit

---

- historial
```js
// estado del fichero
git status

// lista los commits
git log
```

- add (workspace ➔ staged in area)
```js
// añadir fichero a la staged in area
git add fichero

// quitar fichero de la staged in area (oposite of git add)
git restore --staged fichero

// quitar fichero de la staged in area y control de git 
// git ya no lo gestiona en futuros cambios (no existe para él)
git rm --cached fichero
```

- commit (staged in area ➔ repository)
```js
// registra en el repo todos los cambios
git commit -m "mensaje"

// incluye en el commit ficheros en `staged` y los `modified` que no están añadidos
git commit -a -m "mensaje"

// arregla el último commit
git commit --amend
```

- restore
```js
// vuelve versión último commit (borra cambios workspace)
git restore fichero

// quitar fichero de la staged in area (oposite of git add)
git restore --staged fichero

// vuelve versión último commit (borra cambios workspace)
git restore --worktree fichero

// quita de staged in area y vuelve a la versión del último commit
git restore --staged --worktree fichero
```

- actualizar
```js
// obtiene los cambios del repo remoto pero no actualiza
git fetch  
git fetch origin master

// combina cambios de una rama a otra 
//comando local, y no descarga cambios de repo remoto
git merge rama

// descarga y fusiona esos cambios (fetch y merge)
git pull 
git pull origin master

// subir (con -f --force fuerzas la subida)
git push 
git push origin master
```
<br>

```js
| Comando     | Descripción                                                                                        | Fusión cambios en rama actual |
|-------------|----------------------------------------------------------------------------------------------------|-------------------------------|
| git fetch   | Descarga los cambios del repositorio remoto, pero no los integra en la rama actual.                | ❌                           |
| git pull    | Descarga y fusiona los cambios de una rama remota en tu rama actual (combinación de fetch y merge).| ✔️                           |
| git merge   | Fusiona otra rama (local o remota) en tu rama actual, pero no descarga cambios de un remoto.       | ✔️                           |
```
<br>

- borrar y deshacer commits
```js
// borrar:
// elimina commits posteriores / conserva cambios en staged in area
git reset --soft <hash>

// elimina commits posteriores / cambios en working directory
git reset --mixed <hash>

// elimina commits posteriores / NO conserva cambios
git reset --hard <hash>

// deshacer
// revierte cambios de un commit creando uno nuevo
git revert <hash>

// continúa con el revert tras resolver conflictos
git reset --continue

// revertir rango de commit (desde HEAD 3 hacia atrás)
git revert -n HEAD~3..HEAD
``` 

---
<br>

## 4. Sincronización de Git
**_carpeta local / workspace:_**
<br>
están los ficheros en donde trabajamos

**_repositorio local:_**
<br>
rama `master` => donde se guardan al hacer commit
<br>

rama `origin/master` => copia que hay del repositorio remoto **_origin_** de su rama **_master_**

**_repositorio remoto:_**
<br>
repositorio que está en otra máquina
<br>

rama `master` => donde queremos copiar los commits de nuestra rama master
<br>

`origin master` => con separación (hace referencia al remoto)