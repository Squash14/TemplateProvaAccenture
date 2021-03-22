# language: pt
#enconding: UTF-8
@Veiculo
Funcionalidade: Validar Aba Enter Vehicle Data

  Contexto: 
    Dado que acesso a aplicação
    E clico na aba Enter Vehicle Data
    Então visualizo a quantidade de campos a serem preenchidos

  @SmokeTest
  Esquema do Cenario: Validar campos descricaoTeste <descricaoTeste>
    Dado que visualizo o título do campo Make
    E seleciono o veiculo do campo Make
    E visualizo o título Model
    E seleciono o o modelo Scooter no campo Model
    E visualizo o título Cylinder Capacity [ccm]
    E preencho o campo cylinderCapacity "<cylinderCapacity>"
    E visualizo o título Engine Performance [kW]
    E preencho o campo enginePerformance "<enginePerformance>"
    E visualizo o título Date of Manufacture
    E preencho o campo dateManufacture "<dateManufacture>"
    E visualizo o título Number of Seats
    E seleciono o número no campo Number of Seats
    E visualizo o título Right Hand Drive
    E seleciono o campo Right Hand Drive
    E visualizo o título NumberSeats
    E seleciono o número no campo NumberSeats
    E visualizo o título Fuel Type
    E seleciono o combustivel Petrol no campo Fuel Type
    E visualizo o título Payload [kg]
    E preencho o campo payload "<payload>"
    E visualizo o título Total Weight [kg]
    E preencho o campo totalWeight "<totalWeight>"
    E visualizo o título List Price [$]
    E preencho o campo listPrice "<listPrice>"
    E visualizo o título License Plate Number
    E preencho o campo licenseNumber "<licenseNumber>"
    E visualizo o título Annual Mileage [mi]
    E preencho o campo annualMileage "<annualMileage>"
    E visualizo o botão Next
    E clico no botão Next
    #AbaDados
    E visualizo o título First Name
    E preencho o campo firstName "<firstName>"
    E visualizo o título Last Name
    E preencho o campo lastName "<lastName>"
    E visualizo o título Date of Birth
    E preencho o campo dateOfBirth "<dateOfBirth>"
    E visualizo o título Gender
    E seleciono o campo gender
    E visualizo o título Street Address
    E preencho o campo streetAddress "<streetAddres>"
    E visualizo o título Country
    E seleciono o país Brazil no campo Country
    E visualizo o título Zip Code
    E preencho o campo zipCode "<zipCode>"
    E visualizo o título City
    E preencho o campo city "<city>"
    E visualizo o título Occupation
    E seleciono a ocupação Public Offial no campo Occupation
    E visualizo o título Hobbies
    E seleciono o campo hobbies
    E visualizo o título Website
    E preencho o campo website "<website>"
    E visualizo o botão NextInsurantData
    E clico no botão NextInsurantData
    #AbaProduto
    E visualizo o título Start Date
    E preencho o campo startDate "<startDate>"
    E visualizo o título Insurance Sum [$]
    E seleciono um valor no Insurance Sum [$]
    E visualizo o título Merit Rating
    E seleciono um Bonus no campo Merit Rating
    E visualizo o título Damage Insurance
    E seleciono um seguro no campo Damage Insurance
    E visualizo o título Optional Products
    E seleciono um produto campo Optional Products
    E visualizo o título Courtesy Car
    E seleciono uma cortesia no campo Courtesy Car
    E visualizo o botão NextProductData
    E clico no botão NextProductData
    #AbaPrice
    E visualizo os títulos da Aba Select Product Data
    E seleciono um plano no campo Select Option
    E visualizo o botão NextSelectPriceOption
    E clico no botão NextSelectPriceOption
    #AbaCot
    E visualizo o título E-Mail
    E preencho o campo email "<email>"
    E visualizo o título Phone
    E preencho o campo phone "<phone>"
    E visualizo o título Username
    E preencho o campo username "<username>"
    E visualizo o título Password
    E preencho o campo password "<password>"
    E visualizo o título Confirm Password
    E preencho o campo confirmPassword "<confirmPassword>"
    E visualizo o título Comments
    E preencho o campo comments "<comments>"
    E visualizo o botão Send
    Quando clico no botão Send
    Entao visualizo a mensagem "<mensagem>"

    Exemplos: 
      | descricaoTeste | cylinderCapacity | enginePerformance | dateManufacture | payload | totalWeight | listPrice | licenseNumber | annualMileage | firstName | lastName | dateOfBirth | streetAddres             | zipCode  | city     | website                                   | startDate  | email                      | phone       | username      | password  | confirmPassword | comments      | mensagem                |
      | dados Positivo |               12 |                10 | 03/10/2020      |     123 |         123 |      1234 |             1 |           123 | Marcilio  | Junio    | 01/10/1992  | QS 16 Conjuto 01 Lote 36 | 71825601 | Brasilia | https://www.linkedin.com/in/marciliojunio | 05/20/2022 | teste_marcilio@hotmail.com | 61984604488 | testemarcilio | Mjb123123 | Mjb123123       | cadastroteste | Sending e-mail success! |
