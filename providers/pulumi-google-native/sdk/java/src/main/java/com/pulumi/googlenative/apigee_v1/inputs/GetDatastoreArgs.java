// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatastoreArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatastoreArgs Empty = new GetDatastoreArgs();

    @Import(name="datastoreId", required=true)
      private final String datastoreId;

    public String datastoreId() {
        return this.datastoreId;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    public GetDatastoreArgs(
        String datastoreId,
        String organizationId) {
        this.datastoreId = Objects.requireNonNull(datastoreId, "expected parameter 'datastoreId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetDatastoreArgs() {
        this.datastoreId = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatastoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datastoreId;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatastoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder datastoreId(String datastoreId) {
            this.datastoreId = Objects.requireNonNull(datastoreId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }        public GetDatastoreArgs build() {
            return new GetDatastoreArgs(datastoreId, organizationId);
        }
    }
}
