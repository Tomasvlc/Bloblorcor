<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="fr">
	<head>
		<title>Connexion</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	</head>
	<body>

		<div class="navbar-wrapper">
			<div class="container-fluid">
				<nav class="navbar navbar-fixed-top">
					<div class="container">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							</button>
							<a class="navbar-brand" href="#">Covoiturage</a>
						</div>
						<div id="navbar" class="navbar-collapse collapse">
							<ul class="nav navbar-nav">
								<li class="active"><a href="#" class="">Accueil</a></li>
							   <li class="active"><a href="../PageRechercheDeTrajet/Recherche_de_trajet.html">Rechercher un trajet</a></li>
							   <li class="active"><a href="../PageRechercheDeTrajet/New_Trajet.html">Créer un nouveau trajet</a></li>
							</ul>
							<ul class="nav navbar-nav pull-right">
							   <li class="active"><a href="#" class="">Inscription</a></li>
							<!-- <li class=""><a href="#">Logout</a></li> -->
							</ul>
						</div>
						
						<br>
						<div id="login" class="panel panel-primary container">
							<div class="panel-heading"><h3 class="panel-title"><strong> Identification</strong></h3></div>
							  <div class="panel-body">
								<form id="frm-login" method="post" action="./ConnexionServlet">
									<fieldset>
										<div class="form-group">
										  <label class="control-label" for="emailUtilisateur"><span class="glyphicon glyphicon-user"></span> Email</label>  
										  <a class="pull-right" href="#">Créer un compte</a>
										  <div>
											<input id="emailUtilisateur" name="email" type="mail" placeholder="Entrez votre email" class="form-control input-md" required="">
										  </div>
										</div>

										<!-- Password input-->
										<div class="form-group">
										  <label class="control-label" for="mdp"><span class="glyphicon glyphicon-lock"></span> Mot de passe</label>
										  <a class="pull-right" href="#">Mot de passe oublié</a>
										  <div>
											<input id="mdp" name="motDePasse" type="password" placeholder="Entrez votre mot de passe" class="form-control input-md" required="">
										  </div>
										</div>
										<!-- Button -->
										<div class="form-group">
											<label class="control-label" for="btnConnecter"></label>
												<div>
													<button id="btnConnecter" type="submit" name="btnConnecter" class="btn btn-primary">Se connecter</button>
												</div>  
										</div>
									</fieldset>
								</form>

							  </div>
						</div>
					</div>
				</nav>
			</div>
		</div>
	</body>
</html>