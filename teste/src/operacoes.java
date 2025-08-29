
public class operacoes {
    public static void main(String[] args) throws Exception {
        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;

        v1 += v0;
        v2 += --v1;

        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);

        /*
         * EXPLICAÇÃO
         * **1ª Linha: `int v0 = 3;`**
         * - A variável `v0` é inicializada com o valor `3`.
         ** 
         * Estado atual:**
         * - `v0 = 3`
         * 
         * ---
         * 
         * **2ª Linha: `int v1 = v0++;`**
         * - Aqui, temos o operador **pós-incremento** (`v0++`):
         * - O valor **atual** de `v0` (3) é atribuído a `v1`.
         * - Depois disso, o valor de `v0` é incrementado em 1.
         ** 
         * Estado atual:**
         * - `v0 = 4` (incrementado após a atribuição)
         * - `v1 = 3` (recebe o valor antigo de `v0`)
         * 
         * ---
         * 
         * **3ª Linha: `int v2 = ++v1;`**
         * - Aqui, temos o operador **pré-incremento** (`++v1`):
         * - Primeiro, `v1` é incrementado em 1.
         * - Em seguida, o novo valor de `v1` (4) é atribuído a `v2`.
         ** 
         * Estado atual:**
         * - `v1 = 4` (incrementado antes da atribuição)
         * - `v2 = 4` (recebe o valor de `v1`)
         * 
         * ---
         * 
         * **4ª Linha: `v1 += v0;`**
         * - Essa linha equivale a `v1 = v1 + v0`:
         * - `v1` (4) é somado a `v0` (4).
         * - O novo valor de `v1` é 8.
         ** 
         * Estado atual:**
         * - `v0 = 4`
         * - `v1 = 8`
         * 
         * ---
         * 
         * **5ª Linha: `v2 += --v1;`**
         * - Aqui temos duas operações:
         * 1. O operador **pré-decremento** (`--v1`):
         * - `v1` é decrementado em 1, ficando com o valor `7`.
         * 2. O valor de `v1` (7) é somado a `v2` (4):
         * - `v2 = v2 + v1 = 4 + 7 = 11`.
         ** 
         * Estado final:**
         * - `v0 = 4`
         * - `v1 = 7`
         * - `v2 = 11`
         * 
         * ---
         * 
         * **Resultado final:**
         * - `v0 = 4`
         * - `v1 = 7`
         * - `v2 = 11`
         * 
         * ---
         * 
         * **Resumo do processo:**
         * - Operadores pós-incremento (`v0++`) usam o valor **antes de incrementar**.
         * - Operadores pré-incremento (`++v1`) ou pré-decremento (`--v1`) alteram o
         * valor **antes de usá-lo**.
         * - Operações de atribuição composta (`v1 += v0`) somam o valor diretamente ao
         * existente.
         */
    }
}
