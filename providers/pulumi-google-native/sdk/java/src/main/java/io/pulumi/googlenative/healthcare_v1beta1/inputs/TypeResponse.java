// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.FieldResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A type definition for some HL7v2 type (incl. Segments and Datatypes).
 * 
 */
public final class TypeResponse extends io.pulumi.resources.InvokeArgs {

    public static final TypeResponse Empty = new TypeResponse();

    /**
     * The (sub) fields this type has (if not primitive).
     * 
     */
    @InputImport(name="fields", required=true)
      private final List<FieldResponse> fields;

    public List<FieldResponse> getFields() {
        return this.fields;
    }

    /**
     * The name of this type. This would be the segment or datatype name. For example, "PID" or "XPN".
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * If this is a primitive type then this field is the type of the primitive For example, STRING. Leave unspecified for composite types.
     * 
     */
    @InputImport(name="primitive", required=true)
      private final String primitive;

    public String getPrimitive() {
        return this.primitive;
    }

    public TypeResponse(
        List<FieldResponse> fields,
        String name,
        String primitive) {
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.primitive = Objects.requireNonNull(primitive, "expected parameter 'primitive' to be non-null");
    }

    private TypeResponse() {
        this.fields = List.of();
        this.name = null;
        this.primitive = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FieldResponse> fields;
        private String name;
        private String primitive;

        public Builder() {
    	      // Empty
        }

        public Builder(TypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.primitive = defaults.primitive;
        }

        public Builder fields(List<FieldResponse> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder primitive(String primitive) {
            this.primitive = Objects.requireNonNull(primitive);
            return this;
        }
        public TypeResponse build() {
            return new TypeResponse(fields, name, primitive);
        }
    }
}
