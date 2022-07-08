// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare.v1beta1.inputs.ImageArgs;
import com.pulumi.googlenative.healthcare.v1beta1.inputs.SignatureArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConsentArtifactArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConsentArtifactArgs Empty = new ConsentArtifactArgs();

    /**
     * Optional. Screenshots, PDFs, or other binary information documenting the user&#39;s consent.
     * 
     */
    @Import(name="consentContentScreenshots")
    private @Nullable Output<List<ImageArgs>> consentContentScreenshots;

    /**
     * @return Optional. Screenshots, PDFs, or other binary information documenting the user&#39;s consent.
     * 
     */
    public Optional<Output<List<ImageArgs>>> consentContentScreenshots() {
        return Optional.ofNullable(this.consentContentScreenshots);
    }

    /**
     * Optional. An string indicating the version of the consent information shown to the user.
     * 
     */
    @Import(name="consentContentVersion")
    private @Nullable Output<String> consentContentVersion;

    /**
     * @return Optional. An string indicating the version of the consent information shown to the user.
     * 
     */
    public Optional<Output<String>> consentContentVersion() {
        return Optional.ofNullable(this.consentContentVersion);
    }

    @Import(name="consentStoreId", required=true)
    private Output<String> consentStoreId;

    public Output<String> consentStoreId() {
        return this.consentStoreId;
    }

    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * Optional. A signature from a guardian.
     * 
     */
    @Import(name="guardianSignature")
    private @Nullable Output<SignatureArgs> guardianSignature;

    /**
     * @return Optional. A signature from a guardian.
     * 
     */
    public Optional<Output<SignatureArgs>> guardianSignature() {
        return Optional.ofNullable(this.guardianSignature);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Resource name of the Consent artifact, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name of the Consent artifact, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * User&#39;s UUID provided by the client.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return User&#39;s UUID provided by the client.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     * Optional. User&#39;s signature.
     * 
     */
    @Import(name="userSignature")
    private @Nullable Output<SignatureArgs> userSignature;

    /**
     * @return Optional. User&#39;s signature.
     * 
     */
    public Optional<Output<SignatureArgs>> userSignature() {
        return Optional.ofNullable(this.userSignature);
    }

    /**
     * Optional. A signature from a witness.
     * 
     */
    @Import(name="witnessSignature")
    private @Nullable Output<SignatureArgs> witnessSignature;

    /**
     * @return Optional. A signature from a witness.
     * 
     */
    public Optional<Output<SignatureArgs>> witnessSignature() {
        return Optional.ofNullable(this.witnessSignature);
    }

    private ConsentArtifactArgs() {}

    private ConsentArtifactArgs(ConsentArtifactArgs $) {
        this.consentContentScreenshots = $.consentContentScreenshots;
        this.consentContentVersion = $.consentContentVersion;
        this.consentStoreId = $.consentStoreId;
        this.datasetId = $.datasetId;
        this.guardianSignature = $.guardianSignature;
        this.location = $.location;
        this.metadata = $.metadata;
        this.name = $.name;
        this.project = $.project;
        this.userId = $.userId;
        this.userSignature = $.userSignature;
        this.witnessSignature = $.witnessSignature;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConsentArtifactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsentArtifactArgs $;

        public Builder() {
            $ = new ConsentArtifactArgs();
        }

        public Builder(ConsentArtifactArgs defaults) {
            $ = new ConsentArtifactArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consentContentScreenshots Optional. Screenshots, PDFs, or other binary information documenting the user&#39;s consent.
         * 
         * @return builder
         * 
         */
        public Builder consentContentScreenshots(@Nullable Output<List<ImageArgs>> consentContentScreenshots) {
            $.consentContentScreenshots = consentContentScreenshots;
            return this;
        }

        /**
         * @param consentContentScreenshots Optional. Screenshots, PDFs, or other binary information documenting the user&#39;s consent.
         * 
         * @return builder
         * 
         */
        public Builder consentContentScreenshots(List<ImageArgs> consentContentScreenshots) {
            return consentContentScreenshots(Output.of(consentContentScreenshots));
        }

        /**
         * @param consentContentScreenshots Optional. Screenshots, PDFs, or other binary information documenting the user&#39;s consent.
         * 
         * @return builder
         * 
         */
        public Builder consentContentScreenshots(ImageArgs... consentContentScreenshots) {
            return consentContentScreenshots(List.of(consentContentScreenshots));
        }

        /**
         * @param consentContentVersion Optional. An string indicating the version of the consent information shown to the user.
         * 
         * @return builder
         * 
         */
        public Builder consentContentVersion(@Nullable Output<String> consentContentVersion) {
            $.consentContentVersion = consentContentVersion;
            return this;
        }

        /**
         * @param consentContentVersion Optional. An string indicating the version of the consent information shown to the user.
         * 
         * @return builder
         * 
         */
        public Builder consentContentVersion(String consentContentVersion) {
            return consentContentVersion(Output.of(consentContentVersion));
        }

        public Builder consentStoreId(Output<String> consentStoreId) {
            $.consentStoreId = consentStoreId;
            return this;
        }

        public Builder consentStoreId(String consentStoreId) {
            return consentStoreId(Output.of(consentStoreId));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param guardianSignature Optional. A signature from a guardian.
         * 
         * @return builder
         * 
         */
        public Builder guardianSignature(@Nullable Output<SignatureArgs> guardianSignature) {
            $.guardianSignature = guardianSignature;
            return this;
        }

        /**
         * @param guardianSignature Optional. A signature from a guardian.
         * 
         * @return builder
         * 
         */
        public Builder guardianSignature(SignatureArgs guardianSignature) {
            return guardianSignature(Output.of(guardianSignature));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param metadata Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Optional. Metadata associated with the Consent artifact. For example, the consent locale or user agent version.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name Resource name of the Consent artifact, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name of the Consent artifact, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`. Cannot be changed after creation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param userId User&#39;s UUID provided by the client.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId User&#39;s UUID provided by the client.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        /**
         * @param userSignature Optional. User&#39;s signature.
         * 
         * @return builder
         * 
         */
        public Builder userSignature(@Nullable Output<SignatureArgs> userSignature) {
            $.userSignature = userSignature;
            return this;
        }

        /**
         * @param userSignature Optional. User&#39;s signature.
         * 
         * @return builder
         * 
         */
        public Builder userSignature(SignatureArgs userSignature) {
            return userSignature(Output.of(userSignature));
        }

        /**
         * @param witnessSignature Optional. A signature from a witness.
         * 
         * @return builder
         * 
         */
        public Builder witnessSignature(@Nullable Output<SignatureArgs> witnessSignature) {
            $.witnessSignature = witnessSignature;
            return this;
        }

        /**
         * @param witnessSignature Optional. A signature from a witness.
         * 
         * @return builder
         * 
         */
        public Builder witnessSignature(SignatureArgs witnessSignature) {
            return witnessSignature(Output.of(witnessSignature));
        }

        public ConsentArtifactArgs build() {
            $.consentStoreId = Objects.requireNonNull($.consentStoreId, "expected parameter 'consentStoreId' to be non-null");
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
