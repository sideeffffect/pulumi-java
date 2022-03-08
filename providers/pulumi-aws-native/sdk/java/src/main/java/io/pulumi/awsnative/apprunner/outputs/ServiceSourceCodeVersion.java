// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.outputs;

import io.pulumi.awsnative.apprunner.enums.ServiceSourceCodeVersionType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServiceSourceCodeVersion {
    /**
     * Source Code Version Type
     * 
     */
    private final ServiceSourceCodeVersionType type;
    /**
     * Source Code Version Value
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"type","value"})
    private ServiceSourceCodeVersion(
        ServiceSourceCodeVersionType type,
        String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * Source Code Version Type
     * 
    */
    public ServiceSourceCodeVersionType getType() {
        return this.type;
    }
    /**
     * Source Code Version Value
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceCodeVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSourceCodeVersionType type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceCodeVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(ServiceSourceCodeVersionType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ServiceSourceCodeVersion build() {
            return new ServiceSourceCodeVersion(type, value);
        }
    }
}
