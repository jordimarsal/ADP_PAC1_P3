# ADP_PAC1_P3
Principio “Abierto – Cerrado”, “Ley de Demeter”. ADP PAC1 2014-2015 tardor (semestre 1) Pregunta 3

Pregunta 3
El principi que s’està violant és el principi “Obert – Tancat”, concretament la anomenada “Llei de Demèter” o “No parlis amb desconeguts”.
La raó és que es crea una instància c de Client en el mètode de Vehicle getClients i això no hauria de ser possible, donat que no es coneixen ni tenen relació (associació) entre ells. La responsabilitat de servir les dades hauria de recaure amb qui coneix i és l’expert en el Client, que serà el Rental.
