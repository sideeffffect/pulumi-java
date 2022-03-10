// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupImmunityTimeProperty {
    private final Integer immunityTime;

    @OutputCustomType.Constructor
    private RuleGroupImmunityTimeProperty(@OutputCustomType.Parameter("immunityTime") Integer immunityTime) {
        this.immunityTime = immunityTime;
    }

    public Integer getImmunityTime() {
        return this.immunityTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupImmunityTimeProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer immunityTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupImmunityTimeProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.immunityTime = defaults.immunityTime;
        }

        public Builder immunityTime(Integer immunityTime) {
            this.immunityTime = Objects.requireNonNull(immunityTime);
            return this;
        }
        public RuleGroupImmunityTimeProperty build() {
            return new RuleGroupImmunityTimeProperty(immunityTime);
        }
    }
}
