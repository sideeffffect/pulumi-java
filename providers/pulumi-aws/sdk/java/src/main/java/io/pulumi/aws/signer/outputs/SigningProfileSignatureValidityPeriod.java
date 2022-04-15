// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SigningProfileSignatureValidityPeriod {
    private final String type;
    private final Integer value;

    @CustomType.Constructor
    private SigningProfileSignatureValidityPeriod(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") Integer value) {
        this.type = type;
        this.value = value;
    }

    public String type() {
        return this.type;
    }
    public Integer value() {
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

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public SigningProfileSignatureValidityPeriod build() {
            return new SigningProfileSignatureValidityPeriod(type, value);
        }
    }
}
