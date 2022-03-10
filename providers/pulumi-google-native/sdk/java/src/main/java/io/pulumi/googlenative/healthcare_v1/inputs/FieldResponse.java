// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A (sub) field of a type.
 * 
 */
public final class FieldResponse extends io.pulumi.resources.InvokeArgs {

    public static final FieldResponse Empty = new FieldResponse();

    /**
     * The maximum number of times this field can be repeated. 0 or -1 means unbounded.
     * 
     */
    @InputImport(name="maxOccurs", required=true)
      private final Integer maxOccurs;

    public Integer getMaxOccurs() {
        return this.maxOccurs;
    }

    /**
     * The minimum number of times this field must be present/repeated.
     * 
     */
    @InputImport(name="minOccurs", required=true)
      private final Integer minOccurs;

    public Integer getMinOccurs() {
        return this.minOccurs;
    }

    /**
     * The name of the field. For example, "PID-1" or just "1".
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The HL7v2 table this field refers to. For example, PID-15 (Patient's Primary Language) usually refers to table "0296".
     * 
     */
    @InputImport(name="table", required=true)
      private final String table;

    public String getTable() {
        return this.table;
    }

    /**
     * The type of this field. A Type with this name must be defined in an Hl7TypesConfig.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public FieldResponse(
        Integer maxOccurs,
        Integer minOccurs,
        String name,
        String table,
        String type) {
        this.maxOccurs = Objects.requireNonNull(maxOccurs, "expected parameter 'maxOccurs' to be non-null");
        this.minOccurs = Objects.requireNonNull(minOccurs, "expected parameter 'minOccurs' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.table = Objects.requireNonNull(table, "expected parameter 'table' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FieldResponse() {
        this.maxOccurs = null;
        this.minOccurs = null;
        this.name = null;
        this.table = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxOccurs;
        private Integer minOccurs;
        private String name;
        private String table;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxOccurs = defaults.maxOccurs;
    	      this.minOccurs = defaults.minOccurs;
    	      this.name = defaults.name;
    	      this.table = defaults.table;
    	      this.type = defaults.type;
        }

        public Builder maxOccurs(Integer maxOccurs) {
            this.maxOccurs = Objects.requireNonNull(maxOccurs);
            return this;
        }

        public Builder minOccurs(Integer minOccurs) {
            this.minOccurs = Objects.requireNonNull(minOccurs);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder table(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FieldResponse build() {
            return new FieldResponse(maxOccurs, minOccurs, name, table, type);
        }
    }
}
