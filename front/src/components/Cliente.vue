<template>
  <section id="cliente" class="section" >
    <a  v-on:click="alternarComponente"><h2 class="title is-2 is-danger">{{title}}</h2></a>
      <transition name="fade">
      <div v-if="show">
          <listacliente></listacliente>
          <button type="button" class="button is-primary" v-on:click="alternarComponente()">
            Novo
          </button>

        </div>
        <div v-else>

              <formcliente></formcliente>

      </div>
      </transition>
  </section>
</template>
<style>
.fade-enter-active, .fade-leave-active {
  transition: opacity .15s, transform 1s;
}
.fade-enter, .fade-leave-active {
  opacity: 0;
  transform: trnaslatex(20px)/
}

</style>
<script>

import Formcliente from './Formcliente.vue'
import Listacliente from './Listaclientes.vue'

    export default{

        name: 'cliente',
        data(){
            return{
                msg:'FOi',
                show : true,
                title: 'Clientes'
            }
        },
        methods:{
         alternarComponente: function(){
          this.show = !this.show
         }
        },
        components:{
          Formcliente, Listacliente
        }
    }
</script>
