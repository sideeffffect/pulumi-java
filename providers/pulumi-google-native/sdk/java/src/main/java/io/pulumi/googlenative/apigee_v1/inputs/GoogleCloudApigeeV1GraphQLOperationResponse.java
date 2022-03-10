// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents the pairing of GraphQL operation types and the GraphQL operation name.
 * 
 */
public final class GoogleCloudApigeeV1GraphQLOperationResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1GraphQLOperationResponse Empty = new GoogleCloudApigeeV1GraphQLOperationResponse();

    /**
     * GraphQL operation name. The name and operation type will be used to apply quotas. If no name is specified, the quota will be applied to all GraphQL operations irrespective of their operation names in the payload.
     * 
     */
    @InputImport(name="operation", required=true)
      private final String operation;

    public String getOperation() {
        return this.operation;
    }

    /**
     * GraphQL operation types. Valid values include `query` or `mutation`. **Note**: Apigee does not currently support `subscription` types.
     * 
     */
    @InputImport(name="operationTypes", required=true)
      private final List<String> operationTypes;

    public List<String> getOperationTypes() {
        return this.operationTypes;
    }

    public GoogleCloudApigeeV1GraphQLOperationResponse(
        String operation,
        List<String> operationTypes) {
        this.operation = Objects.requireNonNull(operation, "expected parameter 'operation' to be non-null");
        this.operationTypes = Objects.requireNonNull(operationTypes, "expected parameter 'operationTypes' to be non-null");
    }

    private GoogleCloudApigeeV1GraphQLOperationResponse() {
        this.operation = null;
        this.operationTypes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1GraphQLOperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operation;
        private List<String> operationTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1GraphQLOperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operation = defaults.operation;
    	      this.operationTypes = defaults.operationTypes;
        }

        public Builder operation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder operationTypes(List<String> operationTypes) {
            this.operationTypes = Objects.requireNonNull(operationTypes);
            return this;
        }
        public GoogleCloudApigeeV1GraphQLOperationResponse build() {
            return new GoogleCloudApigeeV1GraphQLOperationResponse(operation, operationTypes);
        }
    }
}
