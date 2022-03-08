// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SigningProfileSignatureValidityPeriod {
    private final String type;
    private final Integer value;

    @OutputCustomType.Constructor({"type","value"})
    private SigningProfileSignatureValidityPeriod(
        String type,
        Integer value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return this.type;
    }
    public Integer getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfileSignatureValidityPeriod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningProfileSignatureValidityPeriod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public SigningProfileSignatureValidityPeriod build() {
            return new SigningProfileSignatureValidityPeriod(type, value);
        }
    }
}
