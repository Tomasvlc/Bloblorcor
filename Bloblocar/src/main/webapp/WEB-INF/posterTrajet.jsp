<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fr">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Recherche de trajet</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
    <link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template -->
    <link href="css/landing-page.min.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
    <nav class="navbar navbar-light bg-light static-top">
      <div class="container">
        <a class="navbar-brand" href="#">Site de Covoiturage</a>
        <a class="btn btn-primary" href="#">Inscription</a>
      </div>
    </nav>

    <!-- Masthead -->
    <header class="masthead text-white text-center">
      <div class="overlay"></div>
      <div class="container">
        <div class="row">
          <div class="col-xl-9 mx-auto">
            <h1 class="mb-5">Proposer un nouveau trajet</h1>
          </div>
          <div class="col-md-10 col-lg-8 col-xl-7 mx-auto">
            <form method="post" action="./NewTrajetServlet">
			  <div class="form-row">
				<div class="form-group col-md-6">
				  <label for="inputEmail4">Point de d�part</label>
				  <input name="depart" type="text" id="inputPointDeD�part" class="form-control"  placeholder="Point de d�part" autocomplete="off">
				</div>
				<div class="form-group col-md-6">
				  <label for="inputPassword4">Point d'arriv�</label>
				  <input name="arrivee" type="text" id="inputPointDArriv�" class="form-control"  placeholder="Point de d'arriv�" autocomplete="off">
				</div>
			  </div>
				<div class="form-row">
					<div class="form-group col-md-4">
						<label for="inputState">Heure d'arriv�</label>
						<select id="inputState" class="form-control">
							<option selected>Choisir...</option>
							<option>7h</option>
							<option>8h</option>
							<option>9h</option>
							<option>10h</option>
						</select>
					</div>
					<div class="form-group col-md-4">
						<label for="inputState">Heure de d�part</label>
						<select id="inputState" class="form-control" name="hdepart">
							<option selected>Choisir...</option>
							<option>17:00</option>
							<option>18:00</option>
							<option>19:00</option>
							<option>20:00</option>
						</select>
					</div>
					<div class ="form-group col-md-4">
						<label for="inputState">Vous �tes :</label>
						<br>
						<input type="radio" id="Conducteur" name="TypeDUtilisateur" value="conducteur">
						<label for="conducteur">Conducteur</label>
						<input type="radio" id="Passager" name="TypeDUtilisateur" value="passager">
						<label for="passager">Passager</label>
					</div>
				</div>
				<div class="form-row">
						<button type="submit" class="btn btn-primary btn-lg btn-block">Valider</button>
				</div>
			</form>
          </div>
        </div>
	</div>
    </header>
	
	<!-- -->
	
	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<img class="img-fluid" src="http://placehold.it/750x500" alt="">
				</div>
				<div class="col-md-6">
				
					<div class="row">
						<div class="card w-50">
							<div class="card-body">
							<img src="http://ssl.gstatic.com/accounts/ui/avatar_2x.png" class="rounded-circle" alt="..." style="width:50px;">
								<h5 class="card-title float-right">Card title</h5>
								<a href="#" class="btn btn-primary">D�tails</a>
							</div>
						</div>
						<div class="card w-50">
							<div class="card-body">
								<h5 class="card-title">Card title</h5>
								<p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
								<a href="#" class="btn btn-primary">Button</a>
							</div>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="card w-50">
							<div class="card-body">
								<h5 class="card-title">Card title</h5>
								<p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
								<a href="#" class="btn btn-primary">Button</a>
							</div>
						</div>
						<div class="card w-50">
							<div class="card-body">
								<h5 class="card-title">Card title</h5>
								<p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
								<a href="#" class="btn btn-primary">Button</a>
							</div>
						</div>
					</div>
					
				</div>
			</div>
		</div>
	</div>


    <!-- Footer -->
    <footer class="footer bg-light">
      <div class="container">
        
      </div>
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  </body>

</html>
    