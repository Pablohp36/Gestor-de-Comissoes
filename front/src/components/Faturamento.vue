<template>
  <div id="faturamento">
  table class="table">
<thead>
  <tr>
    <th>Name</th>
    <th>Instrument</th>
    <th></th>
    <th></th>
  </tr>
</thead>
<tfoot>
  <tr>
    <th>Name</th>
    <th>Instrument</th>
    <th></th>
    <th></th>
  </tr>
</tfoot>
<tbody>
  <tr>
    <td>Misty Abbott</td>
    <td>Bass Guitar</td>
    <td class="is-icon">
      <a href="#">
        <i class="fa fa-twitter"></i>
      </a>
    </td>
  </tr>
</table>


  </div>
</template>
<style>
</style>
<script>
export default {
  name: 'faturamento',
  el:'faturamento',
  data(){
    faturamento : {
      nota:{}
      }

  }
}
</script>
