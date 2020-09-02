package lombok;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"id"})
@EqualsAndHashCode(of = {"id"})
public class SamplePojoWithLombok {
	String name;
	int id;
}
