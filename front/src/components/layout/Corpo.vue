<template>
  <section id="corpo" class="section" >
    <div class="container">
      <notafiscal></notafiscal>
    </div>
  </section>
</template>
<style>

</style>
<script>

import Notafiscal from '../Notafiscal.vue'


    export default{

        name: 'corpo',
        data(){
            return{
                msg:'FOi',
                show : true
            }
        },
        components:{
          Notafiscal
        }
    }
</script>
