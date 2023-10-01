package com.sistema.inventario.service;

import com.sistema.inventario.model.ItemModel;
import com.sistema.inventario.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public ItemModel createItem (ItemModel item){
        return itemRepository.save(item);
    }

    public ItemModel getItemById(Long id){
        return itemRepository.findById(id).get();
    }

    public ItemModel updateItem(ItemModel item, Long id){
        if(itemRepository.existsById(id)){
            ItemModel itemDB = itemRepository.findById(id).get();
            itemDB.setName(item.getName());
            itemDB.setDescription(item.getDescription());
            itemDB.setQuantity(item.getQuantity());
            itemDB.setPrice(item.getPrice());
            itemDB.setProvider(item.getProvider());
            itemDB.setStatus(item.getStatus());
            return itemRepository.save(itemDB);
        }
        return null;
    }
    public Boolean deleteItemById(Long id){
        if (itemRepository.existsById(id)){
            itemRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<ItemModel> findAllItems(){
        return (List<ItemModel>) itemRepository.findAll();
    }


}
