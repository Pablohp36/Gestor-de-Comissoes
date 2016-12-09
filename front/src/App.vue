<template>
  <div id="aps">
  <titulo></titulo>
  <corpo></corpo>
  <rodape></rodape>
  </div>
</template>

<script>
 import Titulo from './components/layout/Titulo.vue'
 import Corpo from './components/layout/Corpo.vue'
 import Rodape from './components/layout/Rodape.vue'



export default {
  name: 'app',
  components: {
    Titulo, Corpo, Rodape
  }
}
</script>
