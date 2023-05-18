package characters;

public class RelationshipFinder 
{
    public String findFamilialRelationship(Character p1, Character p2) {
        if (p1 == p2) {
            return "Self";
        }
        if (p1.getMother() != Eve.getInstance() && p1.getMother() == p2) {
            return "Mother";
        }
        if (p1.getFather() != Adam.getInstance() && p1.getFather() == p2) {
            return "Father";
        }
        if (p1.getSpouse() != null && p1.getSpouse() == p2) {
            return "Spouse";
        }
        if (p1.getChildren() != null && p1.getChildren().contains(p2)) {
            return "Child";
        }
        if (p1.getMother() != Eve.getInstance() && p1.getMother().getSpouse() != null && p1.getMother().getSpouse() == p2) {
            return "Stepfather";
        }
        if (p1.getFather() != Adam.getInstance() && p1.getFather().getSpouse() != null && p1.getFather().getSpouse() == p2) {
            return "Stepmother";
        }
        if (p1.getSpouse() != null && p1.getSpouse().getMother() != Eve.getInstance() && p1.getSpouse().getMother() == p2) {
            return "Mother-in-Law";
        }
        if (p1.getSpouse() != null && p1.getSpouse().getFather() != Adam.getInstance() && p1.getSpouse().getFather() == p2) {
            return "Father-in-Law";
        }
        if (p1.getMother() != Eve.getInstance() && p1.getMother().getFather() != Adam.getInstance() && p1.getMother().getFather() == p2) {
            return "Maternal Grandfather";
        }
        if (p1.getMother() != Eve.getInstance() && p1.getMother().getMother() != Eve.getInstance() && p1.getMother().getMother() == p2) {
            return "Maternal Grandmother";
        }
        if (p1.getFather() != Adam.getInstance() && p1.getFather().getFather() != Adam.getInstance() && p1.getFather().getFather() == p2) {
            return "Paternal Grandfather";
        }
        if (p1.getFather() != Adam.getInstance() && p1.getFather().getMother() != Adam.getInstance() && p1.getFather().getMother() == p2) {
            return "Paternal Grandmother";
        }
        if (p1.getMother() != Eve.getInstance() && !p1.getMother().getChildren().isEmpty() && p1.getMother().getChildren().contains(p2)) {
            return "Sibling";
        }
        if (p1.getFather() != Adam.getInstance() && !p1.getFather().getChildren().isEmpty() && p1.getFather().getChildren().contains(p2)) {
            return "Sibling";
        }
        if (p1.getSpouse() != null && findFamilialRelationship(p1.getSpouse(), p2) != null) {
            return "In-Law";
        }
        if (!p1.getChildren().isEmpty()) {
            for (Character child : p1.getChildren()) {
                String relationship = findFamilialRelationship(child, p2);
                if (relationship != null) {
                    return relationship;
                }
            }
        }
        if (p1.getMother() != Eve.getInstance() && !p1.getMother().getChildren().isEmpty()) {
            for (Character sibling : p1.getMother().getChildren()) {
                if (!sibling.getChildren().isEmpty() && sibling.getChildren().contains(p2)) {
                    return "Niece/Nephew";
                }
            }
        }
        if (p1.getFather() != Adam.getInstance() && !p1.getFather().getChildren().isEmpty()) {
            for (Character sibling : p1.getFather().getChildren()) {
                if (!sibling.getChildren().isEmpty() && sibling.getChildren().contains(p2)) {
                    return "Niece/Nephew";
                }
            }
        }
        if (p1.getMother() != Eve.getInstance() && p1.getMother().getMother() != Eve.getInstance() && !p1.getMother().getMother().getChildren().isEmpty() &&
                p1.getMother().getMother().getChildren().contains(p2)) {
            return "Maternal Aunt/Uncle";
        }
        if (p1.getMother() != Eve.getInstance() && p1.getMother().getFather() != Adam.getInstance() && !p1.getMother().getFather().getChildren().isEmpty() &&
            p1.getMother().getFather().getChildren().contains(p2)) {
            return "Maternal Aunt/Uncle";
        }
        if (p1.getFather() != Adam.getInstance() && p1.getFather().getMother() != Eve.getInstance() && !p1.getFather().getMother().getChildren().isEmpty() &&
            p1.getFather().getMother().getChildren().contains(p2)) {
            return "Paternal Aunt/Uncle";
                
        }
        if (p1.getFather() != Adam.getInstance() && p1.getFather().getFather() != Adam.getInstance() && !p1.getFather().getFather().getChildren().isEmpty() &&
            p1.getFather().getFather().getChildren().contains(p2)) {
            return "Paternal Aunt/Uncle";
        }
        if (p1.getMother() != Eve.getInstance() && p1.getMother().getMother() != Eve.getInstance() && !p1.getMother().getMother().getChildren().isEmpty()) {
            for (Character cousin : p1.getMother().getMother().getChildren()) {
                if (!cousin.getChildren().isEmpty() && cousin.getChildren().contains(p2)) {
                    return "Maternal Cousin";
                }
            }
        }
        if (p1.getMother() != Eve.getInstance() && p1.getMother().getFather() != Adam.getInstance() && !p1.getMother().getFather().getChildren().isEmpty()) {
            for (Character cousin : p1.getMother().getFather().getChildren()) {
                if (!cousin.getChildren().isEmpty() && cousin.getChildren().contains(p2)) {
                    return "Maternal Cousin";
                }
            }
        }
        if (p1.getFather() != Adam.getInstance() && p1.getFather().getMother() != Eve.getInstance() && !p1.getFather().getMother().getChildren().isEmpty()) {
            for (Character cousin : p1.getFather().getMother().getChildren()) {
                if (!cousin.getChildren().isEmpty() && cousin.getChildren().contains(p2)) {
                    return "Paternal Cousin";
                }
            }
        }
        if (p1.getFather() != Adam.getInstance() && p1.getFather().getFather() != Adam.getInstance() && !p1.getFather().getFather().getChildren().isEmpty()) {
            for (Character cousin : p1.getFather().getFather().getChildren()) {
                if (!cousin.getChildren().isEmpty() && cousin.getChildren().contains(p2)) {
                    return "Paternal Cousin";
                }
            }
        }
        return null;
    }
}

