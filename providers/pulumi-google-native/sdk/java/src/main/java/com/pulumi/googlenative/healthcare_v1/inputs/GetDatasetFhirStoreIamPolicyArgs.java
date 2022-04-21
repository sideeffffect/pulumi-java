// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatasetFhirStoreIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatasetFhirStoreIamPolicyArgs Empty = new GetDatasetFhirStoreIamPolicyArgs();

    @Import(name="datasetId", required=true)
    private String datasetId;

    public String datasetId() {
        return this.datasetId;
    }

    @Import(name="fhirStoreId", required=true)
    private String fhirStoreId;

    public String fhirStoreId() {
        return this.fhirStoreId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDatasetFhirStoreIamPolicyArgs() {}

    private GetDatasetFhirStoreIamPolicyArgs(GetDatasetFhirStoreIamPolicyArgs $) {
        this.datasetId = $.datasetId;
        this.fhirStoreId = $.fhirStoreId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatasetFhirStoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatasetFhirStoreIamPolicyArgs $;

        public Builder() {
            $ = new GetDatasetFhirStoreIamPolicyArgs();
        }

        public Builder(GetDatasetFhirStoreIamPolicyArgs defaults) {
            $ = new GetDatasetFhirStoreIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetId(String datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder fhirStoreId(String fhirStoreId) {
            $.fhirStoreId = fhirStoreId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetDatasetFhirStoreIamPolicyArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.fhirStoreId = Objects.requireNonNull($.fhirStoreId, "expected parameter 'fhirStoreId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
