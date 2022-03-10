// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dns_v1beta2.outputs.ResourceRecordSetResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ResponsePolicyRuleLocalDataResponse {
    /**
     * All resource record sets for this selector, one per resource record type. The name must match the dns_name.
     * 
     */
    private final List<ResourceRecordSetResponse> localDatas;

    @OutputCustomType.Constructor
    private ResponsePolicyRuleLocalDataResponse(@OutputCustomType.Parameter("localDatas") List<ResourceRecordSetResponse> localDatas) {
        this.localDatas = localDatas;
    }

    /**
     * All resource record sets for this selector, one per resource record type. The name must match the dns_name.
     * 
    */
    public List<ResourceRecordSetResponse> getLocalDatas() {
        return this.localDatas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePolicyRuleLocalDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ResourceRecordSetResponse> localDatas;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePolicyRuleLocalDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localDatas = defaults.localDatas;
        }

        public Builder localDatas(List<ResourceRecordSetResponse> localDatas) {
            this.localDatas = Objects.requireNonNull(localDatas);
            return this;
        }
        public ResponsePolicyRuleLocalDataResponse build() {
            return new ResponsePolicyRuleLocalDataResponse(localDatas);
        }
    }
}
