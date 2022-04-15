// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLambdaFunctionAssociationResult {
    private final String functionArn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String instanceId;

    @CustomType.Constructor
    private GetLambdaFunctionAssociationResult(
        @CustomType.Parameter("functionArn") String functionArn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId) {
        this.functionArn = functionArn;
        this.id = id;
        this.instanceId = instanceId;
    }

    public String functionArn() {
        return this.functionArn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public String instanceId() {
        return this.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLambdaFunctionAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionArn;
        private String id;
        private String instanceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLambdaFunctionAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
        }

        public Builder functionArn(String functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }        public GetLambdaFunctionAssociationResult build() {
            return new GetLambdaFunctionAssociationResult(functionArn, id, instanceId);
        }
    }
}
