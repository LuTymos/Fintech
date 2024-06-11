document.addEventListener('DOMContentLoaded', function () {
    const addRecordForm = document.getElementById('add-record-form');
    const recordsTbody = document.getElementById('records-tbody');

    // Função para adicionar um novo registro na tabela
    function addRecordToTable(record) {
        const row = document.createElement('tr');

        row.innerHTML = `
            <td>${record.type}</td>
            <td>R$ ${record.value.toFixed(2)}</td>
            <td>${record.date}</td>
            <td>${record.category}</td>
            <td>${record.method}</td>
        `;

        recordsTbody.appendChild(row);
    }

    // Evento de envio do formulário para adicionar um novo registro
    if (addRecordForm) {
        addRecordForm.addEventListener('submit', function (event) {
            event.preventDefault();

            const type = document.getElementById('type').value;
            const value = parseFloat(document.getElementById('value').value);
            const date = document.getElementById('date').value;
            const category = document.getElementById('category').value;
            const method = document.getElementById('method').value;

            const newRecord = {
                type,
                value,
                date,
                category,
                method
            };

            addRecordToTable(newRecord);
            addRecordForm.reset();
        });
    }

    // Adicionar registros fictícios automaticamente
    const fictitiousRecords = [
        { type: 'Despesa', value: 50.00, date: '2023-06-01', category: 'Restaurante', method: 'Crédito' },
        { type: 'Receita', value: 3000.00, date: '2023-06-05', category: 'Salário', method: 'PIX' },
        { type: 'Despesa', value: 150.00, date: '2023-06-10', category: 'Transporte', method: 'Dinheiro' },
        { type: 'Receita', value: 200.00, date: '2023-06-15', category: 'Outros', method: 'Débito' },
        { type: 'Despesa', value: 500.00, date: '2023-06-20', category: 'Aluguel', method: 'PIX' }
    ];

    fictitiousRecords.forEach(addRecordToTable);

});
