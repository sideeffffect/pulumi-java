// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserDataMappingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserDataMappingArgs Empty = new GetUserDataMappingArgs();

    @Import(name="consentStoreId", required=true)
      private final String consentStoreId;

    public String consentStoreId() {
        return this.consentStoreId;
    }

    @Import(name="datasetId", required=true)
      private final String datasetId;

    public String datasetId() {
        return this.datasetId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="userDataMappingId", required=true)
      private final String userDataMappingId;

    public String userDataMappingId() {
        return this.userDataMappingId;
    }

    public GetUserDataMappingArgs(
        String consentStoreId,
        String datasetId,
        String location,
        @Nullable String project,
        String userDataMappingId) {
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.userDataMappingId = Objects.requireNonNull(userDataMappingId, "expected parameter 'userDataMappingId' to be non-null");
    }

    private GetUserDataMappingArgs() {
        this.consentStoreId = null;
        this.datasetId = null;
        this.location = null;
        this.project = null;
        this.userDataMappingId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserDataMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consentStoreId;
        private String datasetId;
        private String location;
        private @Nullable String project;
        private String userDataMappingId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserDataMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.datasetId = defaults.datasetId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.userDataMappingId = defaults.userDataMappingId;
        }

        public Builder consentStoreId(String consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder userDataMappingId(String userDataMappingId) {
            this.userDataMappingId = Objects.requireNonNull(userDataMappingId);
            return this;
        }        public GetUserDataMappingArgs build() {
            return new GetUserDataMappingArgs(consentStoreId, datasetId, location, project, userDataMappingId);
        }
    }
}
