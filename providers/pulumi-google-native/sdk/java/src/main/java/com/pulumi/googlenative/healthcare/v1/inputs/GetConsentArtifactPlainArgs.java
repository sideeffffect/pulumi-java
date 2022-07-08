// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConsentArtifactPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConsentArtifactPlainArgs Empty = new GetConsentArtifactPlainArgs();

    @Import(name="consentArtifactId", required=true)
    private String consentArtifactId;

    public String consentArtifactId() {
        return this.consentArtifactId;
    }

    @Import(name="consentStoreId", required=true)
    private String consentStoreId;

    public String consentStoreId() {
        return this.consentStoreId;
    }

    @Import(name="datasetId", required=true)
    private String datasetId;

    public String datasetId() {
        return this.datasetId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetConsentArtifactPlainArgs() {}

    private GetConsentArtifactPlainArgs(GetConsentArtifactPlainArgs $) {
        this.consentArtifactId = $.consentArtifactId;
        this.consentStoreId = $.consentStoreId;
        this.datasetId = $.datasetId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConsentArtifactPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConsentArtifactPlainArgs $;

        public Builder() {
            $ = new GetConsentArtifactPlainArgs();
        }

        public Builder(GetConsentArtifactPlainArgs defaults) {
            $ = new GetConsentArtifactPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder consentArtifactId(String consentArtifactId) {
            $.consentArtifactId = consentArtifactId;
            return this;
        }

        public Builder consentStoreId(String consentStoreId) {
            $.consentStoreId = consentStoreId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetConsentArtifactPlainArgs build() {
            $.consentArtifactId = Objects.requireNonNull($.consentArtifactId, "expected parameter 'consentArtifactId' to be non-null");
            $.consentStoreId = Objects.requireNonNull($.consentStoreId, "expected parameter 'consentStoreId' to be non-null");
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
