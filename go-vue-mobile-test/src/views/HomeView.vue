<template>
  <main class="flex flex-col items-center gap-2 mt-10">
    <InputText type="text" v-model="nameInput" placeholder="Name" />
    <Button label="Go!" @click="getWisdom" :disabled="nameInput.length === 0" />
    <div class="font-bold text-center">{{ wisdomResultText }}</div>
  </main>
</template>

<script setup lang="ts">
import { ref } from 'vue'
import InputText from 'primevue/inputtext'
import Button from 'primevue/button'
import { registerPlugin } from '@capacitor/core'

const nameInput = ref<string>('')
const wisdomResultText = ref<string>('')

interface WisdomPlugin {
  pleaseGiveMeWisdomSensei(options: { name: string }): Promise<{ result: string }>
}

const Wisdom = registerPlugin<WisdomPlugin>('Wisdom')

async function getWisdom() {
  const result = await Wisdom.pleaseGiveMeWisdomSensei({ name: nameInput.value })
  wisdomResultText.value = result.result
}
</script>
