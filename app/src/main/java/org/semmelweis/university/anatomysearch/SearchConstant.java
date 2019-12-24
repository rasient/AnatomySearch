package org.semmelweis.university.anatomysearch;

import java.util.Map;
import java.util.TreeMap;

class SearchConstant {

    static String ARROW_UP="up";
    static String ARROW_DOWN="down";

    static Map<String,TreeMap<Integer, SearchDto>> fragmentMap = new TreeMap<>();
    static {
        //Skeleton
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Skeletal System", R.drawable.skeleton);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Atlas", R.drawable.atlas);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Axis", R.drawable.axis);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Carpus", R.drawable.carpus);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Cervical Vertebrae", R.drawable.cervical_vertebrae);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Clavicle", R.drawable.clavicle);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Coccyx", R.drawable.coccyx);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Spine", R.drawable.columna_vertebralis);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Hip", R.drawable.coxa);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Skull", R.drawable.cranium);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Femur", R.drawable.femur);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Fibula", R.drawable.fibula);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Frontal Bone", R.drawable.frontal);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Humerus", R.drawable.humerus);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Ilium", R.drawable.ilium);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Ischium", R.drawable.ischium);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Lumbar Vertebrae", R.drawable.lumbar_vertebrae);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Malar", R.drawable.malar);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Mandible", R.drawable.mandible);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Hand", R.drawable.manus);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Maxilla", R.drawable.maxilla);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Metacarpal", R.drawable.metacarpal);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Metatarsal", R.drawable.metatarsal);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Nasal", R.drawable.nasal);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Occipital", R.drawable.occipital);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Orbit", R.drawable.orbit);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Parietal bone", R.drawable.parietal);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Patella", R.drawable.patella);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Phalanges", R.drawable.phalanges);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Phalanx", R.drawable.phalanx);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Pubis", R.drawable.pubis);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Radius", R.drawable.radius);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Rib", R.drawable.rib);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Sacrum", R.drawable.sacrum);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Scapula", R.drawable.scapula);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Sphenoid", R.drawable.sphenoid);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Sternum", R.drawable.sternum);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Tarsus", R.drawable.tarsus);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Temporal", R.drawable.temporal);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Thoratic Vertebrae", R.drawable.thoratic_vertebrae);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Tibia", R.drawable.tibia);
        addPartsToMap(R.drawable.skeleton, "Skeletal System", "Ulna", R.drawable.ulna);

        //body
        addPartsToMap(R.drawable.body, "Body Organs", "Intestines", R.drawable.intestines);
        addPartsToMap(R.drawable.body, "Body Organs", "Kidney", R.drawable.kidney);
        addPartsToMap(R.drawable.body, "Body Organs", "Liver", R.drawable.liver);
        addPartsToMap(R.drawable.body, "Body Organs", "Lungs", R.drawable.lungs);
        addPartsToMap(R.drawable.body, "Body Organs", "Pancreas", R.drawable.pancreas);
        addPartsToMap(R.drawable.body, "Body Organs", "Reproductive System", R.drawable.reproductive_system);
        addPartsToMap(R.drawable.body, "Body Organs", "Stomach", R.drawable.stomach);
        addPartsToMap(R.drawable.body, "Body Organs", "Thymus", R.drawable.thymus);
        addPartsToMap(R.drawable.body, "Body Organs", "Thyroid", R.drawable.thyroid);
        addPartsToMap(R.drawable.body, "Body Organs", "Urinary System", R.drawable.urinary_system);

        //details
        addPartsToMap(R.drawable.atlas_details, "Atlas details", "Atlas details", R.drawable.atlas_details);
        addPartsToMap(R.drawable.axis_details, "Axis details", "Axis details", R.drawable.axis_details);
        addPartsToMap(R.drawable.bone_details, "Bone details", "Bone details", R.drawable.bone_details);
        addPartsToMap(R.drawable.cervical_vertebrae_details, "Cervical Vertebrae details", "Cervical Vertebrae details", R.drawable.cervical_vertebrae_details);
        addPartsToMap(R.drawable.joint_details, "Joint details", "Joint details", R.drawable.joint_details);
        addPartsToMap(R.drawable.lumbar_vertebrae_details, "Lumbar Vertebrae details", "Lumbar Vertebrae details", R.drawable.lumbar_vertebrae_details);
        addPartsToMap(R.drawable.muscle_details, "Muscle details", "Muscle details", R.drawable.muscle_details);
        addPartsToMap(R.drawable.muscle_fiber_details, "Muscle Fiber details", "Muscle Fiber details", R.drawable.muscle_fiber_details);
        addPartsToMap(R.drawable.muscle_motor_unit, "Muscle Motor Unit", "Muscle Motor Unit details", R.drawable.muscle_motor_unit);
        addPartsToMap(R.drawable.muscle_shape_details, "Muscle Shape details", "Muscle Shape details", R.drawable.muscle_shape_details);
        addPartsToMap(R.drawable.sacrum_details, "Sacrum details", "Sacrum details", R.drawable.sacrum_details);
        addPartsToMap(R.drawable.spina_joints, "Spina Joints", "Spina Joints details", R.drawable.spina_joints);
        addPartsToMap(R.drawable.thoratic_vertebrae_details, "Thoratic Vertebrae details", "Thoratic Vertebrae details", R.drawable.thoratic_vertebrae_details);
    }

    private static void addPartsToMap(Integer imageId, String numbers, String partName, Integer selectorId) {
        TreeMap<Integer,SearchDto> partSubMap= fragmentMap.containsKey(partName) ? fragmentMap.get(partName) : new TreeMap<>();
        partSubMap.put(imageId, new SearchDto(numbers, selectorId));
        fragmentMap.put(partName,partSubMap);
    }
}
