# github.com/interviewbit-academy/segregate_photos

directory="original-photos/*.jpg"
for file in $directory
do
    path=${file##*/}
    dir=$(echo $path | tr '-' '/')
    fname=${dir##*/}
    dname=${dir%/*}
    mkdir -p "organised/$dname"
    mv "$file" "organised/$dname/$fname"
done
