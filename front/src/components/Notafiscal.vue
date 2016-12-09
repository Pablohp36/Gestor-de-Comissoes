<template>
  <section id="cliente" class="section" >
  <h2 class="title is-h2">Registro de Venda</h2>

    <div class="columns">
      <div class="column is-one-quarter">
          <label for="numero" class="label">Numero:</label>
          <input name="numero" id="numero"  class="input" type="text" placeholder="Número do documento">
      </div>
      <div class="column is-one-quarter">
        <label for="datavenda" class="label">Data da Venda:</label>
        <input name="datavenda" id="datavenda"  class="input" type="text" placeholder="Data da Venda">
      </div>
    </div>

    <div class="columns">
      <div class="column">
        <label for="cliente" class="label">Cliente:</label>
        <input name="cliente" id="cliente"  class="input" type="text" placeholder="Cliente">
      </div>
      <div class="column">
        <label for="representante" class="label">Representante:</label>
        <input name="representante" id="representante"  class="input" type="text" placeholder="Representante">
      </div>
      <div class="column">
        <label for="valor" class="label">Valor:</label>
        <input name="valor" id="valor"  class="input" type="text" placeholder="Valor">
      </div>
    </div>
    <button type="button" class="button is-primary">Salvar</button>



      </div>
    </div>


<faturamento></faturamento>

  </section>
</template>
<style>
</style
<script>
import Faturamento from './Faturamento.vue'

 export default {
  name:'notafiscal',
  data (){
    nota : {numero: '', datavenda:'',cliente:'',representante:'',valor:''}
 },
 components: {
    Faturamento
}
</script>
