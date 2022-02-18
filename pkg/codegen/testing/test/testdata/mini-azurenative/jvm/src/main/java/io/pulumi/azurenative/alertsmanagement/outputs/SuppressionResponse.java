// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class SuppressionResponse {
    @OutputCustomType.Constructor({})
    private SuppressionResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuppressionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(SuppressionResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public SuppressionResponse build() {
            return new SuppressionResponse();
        }
    }
}
