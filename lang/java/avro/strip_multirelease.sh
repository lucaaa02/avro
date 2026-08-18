mkdir -p ../../../tools/evosuite-libs
rm -f ../../../tools/evosuite-libs/*.jar

IFS=':' read -ra JARS <<< "$(cat cp.txt)"
> cp-evosuite.txt

for jar in "${JARS[@]}"; do
  name=$(basename "$jar")
  cp "$jar" "../../../tools/evosuite-libs/$name"
  zip -q -d "../../../tools/evosuite-libs/$name" "META-INF/versions/*" 2>/dev/null
  echo -n "../../../tools/evosuite-libs/$name:" >> cp-evosuite.txt
done

sed -i 's/:$//' cp-evosuite.txt
echo "Fatto. Classpath ripulito salvato in cp-evosuite.txt"
