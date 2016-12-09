<template>
  <footer class="footer">
    <div class="container">
      <div class="content has-text-centered">
        <p>
           {{msg}}
        </p>
        <p>

        </p>
      </div>
    </div>
  </footer>
</template>
<style>
    body{
        
    }
</style>
<script>

    export default{
        name: 'rodape',
        data(){
            return{
                msg:'Desenvolvido por Wilton Ribeiro Silva'
            }
        }
    }
</script>
