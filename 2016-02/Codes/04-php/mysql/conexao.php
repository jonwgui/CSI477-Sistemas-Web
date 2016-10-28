<?php

  $conexao = new mysqli("localhost", "sistemaweb", "123456", "academico");

  if ($conexao->connect_errno) {
    echo "Falha de conexão!";
  } else {
    //echo "Conexão realizada com sucesso!";
    //echo $conexao->host_info;
  }

  $sql = "SELECT id, nome FROM alunos";
  $resultado = $conexao->query($sql);

  //echo "Linhas retornadas: " . $resultado->num_rows;
  //echo "<br>\n";


?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Dados dos alunos</title>
  </head>
  <body>

    <table>
      <tr>
        <th>Código</th>
        <th>Nome</th>
      </tr>

      <!-- Exibicao dos dados dos alunos //-->
      <?php
        while($linha = $resultado->fetch_assoc()) {
       ?>
      <tr>
        <td><?php echo $linha["id"]; ?></td>
        <td><?php echo $linha["nome"]; ?></td>
      </tr>

      <?php } ?>

    </table>

  </body>
</html>
