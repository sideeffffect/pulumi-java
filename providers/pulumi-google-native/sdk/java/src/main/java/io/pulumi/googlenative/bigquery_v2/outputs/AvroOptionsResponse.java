// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class AvroOptionsResponse {
    /**
     * [Optional] If sourceFormat is set to "AVRO", indicates whether to interpret logical types as the corresponding BigQuery data type (for example, TIMESTAMP), instead of using the raw type (for example, INTEGER).
     * 
     */
    private final Boolean useAvroLogicalTypes;

    @OutputCustomType.Constructor({"useAvroLogicalTypes"})
    private AvroOptionsResponse(Boolean useAvroLogicalTypes) {
        this.useAvroLogicalTypes = useAvroLogicalTypes;
    }

    /**
     * [Optional] If sourceFormat is set to "AVRO", indicates whether to interpret logical types as the corresponding BigQuery data type (for example, TIMESTAMP), instead of using the raw type (for example, INTEGER).
     * 
    */
    public Boolean getUseAvroLogicalTypes() {
        return this.useAvroLogicalTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvroOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean useAvroLogicalTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(AvroOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.useAvroLogicalTypes = defaults.useAvroLogicalTypes;
        }

        public Builder setUseAvroLogicalTypes(Boolean useAvroLogicalTypes) {
            this.useAvroLogicalTypes = Objects.requireNonNull(useAvroLogicalTypes);
            return this;
        }
        public AvroOptionsResponse build() {
            return new AvroOptionsResponse(useAvroLogicalTypes);
        }
    }
}
