package mindul.jasovise_backend.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import mindul.jasovise_backend.dtos.PrintStrongPointDTO;
import mindul.jasovise_backend.dtos.SelectStrongPointDTO;

@CrossOrigin(origins = { "http://localhost:3000", "http://3.133.233.81:3000", "http://www.matilda-hanium.click:3000",
        "http://localhost:8000", "http://3.133.233.81:8000", "http://www.matilda-hanium.click:8000",
        "http://localhost:8100", "http://3.133.233.81:8100", "http://www.matilda-hanium.click:8100" })
@RequiredArgsConstructor
@RestController()
@RequestMapping("/items")
@Transactional(readOnly = true)
public class RoleController {

    // Repository와 통신하는 클래스
    // private final ItemRepository itemRepo;
    // private final MemberRepository memberRepo;

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    // @ApiOperation(value = "=StrongPoints 검색", protocols = "http")
    public ResponseEntity<List<PrintStrongPointDTO>> findAll(@Valid SelectStrongPointDTO itemDTO) {
          return null;
    //     // 조건에 맞는 아이템 검색
    //     List<Item> items = itemRepo.findAllByDTO(itemDTO);

    //     // 검색 된 아이템이 없으면 예외 발생
    //     if (items.isEmpty()) {
    //         throw new ResourceNotFoundException("Not found Items");
    //     }

    //     // printDTO 형식으로 반환
    //     return new ResponseEntity<>(toPrintDTO(items), HttpStatus.OK);
    }


    // @PostMapping("/new")
    // @ApiOperation(value = "신규 Item 추가", protocols = "http")
    // @Transactional()
    // public ResponseEntity<PrintDetailItemDTO> insert(@RequestBody @Valid InsertItemDTO itemDTO) {

    //     // 아이템 이름이 없다면 현재 시간 사용
    //     if (StringUtils.isNullOrEmpty(itemDTO.getTitle())) {
    //         Date now = new Date();
    //         itemDTO.setTitle(now.toString());
    //     }

    //     // memberNum을 통해 member 검색, 잘못된 memberNum이 들어오면 예외 발생
    //     Member member = memberRepo.findById(itemDTO.getMemberNum())
    //             .orElseThrow(() -> new DataFormatException("Wrong Member with MemberNum = " + itemDTO.getMemberNum()));

    //     // catCode를 통해 category 검색, 잘못된 catCode가 들어오면 예외 발생
    //     Category category = categoryRepo.findById(itemDTO.getCatCode())
    //             .orElseThrow(() -> new DataFormatException("Wrong Category with catCode = " + itemDTO.getCatCode()));

    //     // itemDTO를 사용해 Item 객체 생성
    //     ItemBuilder itemBuilder = Item.builder();
    //     itemBuilder.member(member).category(category).title(itemDTO.getTitle()).imgUrl(itemDTO.getImgUrl())
    //             .objectUrl(itemDTO.getObjectUrl()).stateCode("CR");

    //     // 생성한 아이템 저장
    //     Item newItem = itemRepo.save(itemBuilder.build());

    //     // 아이템 생성 컨트랙트 생성
    //     InsertHistoryDTOBuilder insertHistoryBuilder = InsertHistoryDTO.builder();
    //     insertHistoryBuilder.itemNum(newItem.getItemNum()).sellerNum(newItem.getMember().getMemberNum())
    //             .stateCode(newItem.getStateCode());
    //     historyController.insert(insertHistoryBuilder.build());

    //     // printDTO 형식으로 반환
    //     return new ResponseEntity<>(toPrintDetailDTO(newItem), HttpStatus.CREATED);
    // }
}