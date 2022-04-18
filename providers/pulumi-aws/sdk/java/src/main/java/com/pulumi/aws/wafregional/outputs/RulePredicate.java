// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RulePredicate {
    private final String dataId;
    private final Boolean negated;
    private final String type;

    @CustomType.Constructor
    private RulePredicate(
        @CustomType.Parameter("dataId") String dataId,
        @CustomType.Parameter("negated") Boolean negated,
        @CustomType.Parameter("type") String type) {
        this.dataId = dataId;
        this.negated = negated;
        this.type = type;
    }

    public String dataId() {
        return this.dataId;
    }
    public Boolean negated() {
        return this.negated;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulePredicate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataId;
        private Boolean negated;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RulePredicate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataId = defaults.dataId;
    	      this.negated = defaults.negated;
    	      this.type = defaults.type;
        }

        public Builder dataId(String dataId) {
            this.dataId = Objects.requireNonNull(dataId);
            return this;
        }
        public Builder negated(Boolean negated) {
            this.negated = Objects.requireNonNull(negated);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RulePredicate build() {
            return new RulePredicate(dataId, negated, type);
        }
    }
}
