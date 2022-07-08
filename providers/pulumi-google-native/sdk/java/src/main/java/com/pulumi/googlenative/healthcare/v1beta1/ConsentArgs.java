// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare.v1beta1.enums.ConsentState;
import com.pulumi.googlenative.healthcare.v1beta1.inputs.GoogleCloudHealthcareV1beta1ConsentPolicyArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConsentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConsentArgs Empty = new ConsentArgs();

    /**
     * The resource name of the Consent artifact that contains proof of the end user&#39;s consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
     * 
     */
    @Import(name="consentArtifact", required=true)
    private Output<String> consentArtifact;

    /**
     * @return The resource name of the Consent artifact that contains proof of the end user&#39;s consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
     * 
     */
    public Output<String> consentArtifact() {
        return this.consentArtifact;
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
     * Timestamp in UTC of when this Consent is considered expired.
     * 
     */
    @Import(name="expireTime")
    private @Nullable Output<String> expireTime;

    /**
     * @return Timestamp in UTC of when this Consent is considered expired.
     * 
     */
    public Optional<Output<String>> expireTime() {
        return Optional.ofNullable(this.expireTime);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Optional. Represents a user&#39;s consent in terms of the resources that can be accessed and under what conditions.
     * 
     */
    @Import(name="policies")
    private @Nullable Output<List<GoogleCloudHealthcareV1beta1ConsentPolicyArgs>> policies;

    /**
     * @return Optional. Represents a user&#39;s consent in terms of the resources that can be accessed and under what conditions.
     * 
     */
    public Optional<Output<List<GoogleCloudHealthcareV1beta1ConsentPolicyArgs>>> policies() {
        return Optional.ofNullable(this.policies);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Indicates the current state of this Consent.
     * 
     */
    @Import(name="state", required=true)
    private Output<ConsentState> state;

    /**
     * @return Indicates the current state of this Consent.
     * 
     */
    public Output<ConsentState> state() {
        return this.state;
    }

    /**
     * Input only. The time to live for this Consent from when it is created.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<String> ttl;

    /**
     * @return Input only. The time to live for this Consent from when it is created.
     * 
     */
    public Optional<Output<String>> ttl() {
        return Optional.ofNullable(this.ttl);
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

    private ConsentArgs() {}

    private ConsentArgs(ConsentArgs $) {
        this.consentArtifact = $.consentArtifact;
        this.consentStoreId = $.consentStoreId;
        this.datasetId = $.datasetId;
        this.expireTime = $.expireTime;
        this.location = $.location;
        this.metadata = $.metadata;
        this.name = $.name;
        this.policies = $.policies;
        this.project = $.project;
        this.state = $.state;
        this.ttl = $.ttl;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConsentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsentArgs $;

        public Builder() {
            $ = new ConsentArgs();
        }

        public Builder(ConsentArgs defaults) {
            $ = new ConsentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consentArtifact The resource name of the Consent artifact that contains proof of the end user&#39;s consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
         * 
         * @return builder
         * 
         */
        public Builder consentArtifact(Output<String> consentArtifact) {
            $.consentArtifact = consentArtifact;
            return this;
        }

        /**
         * @param consentArtifact The resource name of the Consent artifact that contains proof of the end user&#39;s consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consentArtifacts/{consent_artifact_id}`.
         * 
         * @return builder
         * 
         */
        public Builder consentArtifact(String consentArtifact) {
            return consentArtifact(Output.of(consentArtifact));
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
         * @param expireTime Timestamp in UTC of when this Consent is considered expired.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(@Nullable Output<String> expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        /**
         * @param expireTime Timestamp in UTC of when this Consent is considered expired.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(String expireTime) {
            return expireTime(Output.of(expireTime));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param metadata Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Optional. User-supplied key-value pairs used to organize Consent resources. Metadata keys must: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - begin with a letter - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes Metadata values must be: - be between 1 and 63 characters long - have a UTF-8 encoding of maximum 128 bytes - consist of up to 63 characters including lowercase letters, numeric characters, underscores, and dashes No more than 64 metadata entries can be associated with a given consent.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name of the Consent, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/consents/{consent_id}`. Cannot be changed after creation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policies Optional. Represents a user&#39;s consent in terms of the resources that can be accessed and under what conditions.
         * 
         * @return builder
         * 
         */
        public Builder policies(@Nullable Output<List<GoogleCloudHealthcareV1beta1ConsentPolicyArgs>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies Optional. Represents a user&#39;s consent in terms of the resources that can be accessed and under what conditions.
         * 
         * @return builder
         * 
         */
        public Builder policies(List<GoogleCloudHealthcareV1beta1ConsentPolicyArgs> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies Optional. Represents a user&#39;s consent in terms of the resources that can be accessed and under what conditions.
         * 
         * @return builder
         * 
         */
        public Builder policies(GoogleCloudHealthcareV1beta1ConsentPolicyArgs... policies) {
            return policies(List.of(policies));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param state Indicates the current state of this Consent.
         * 
         * @return builder
         * 
         */
        public Builder state(Output<ConsentState> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Indicates the current state of this Consent.
         * 
         * @return builder
         * 
         */
        public Builder state(ConsentState state) {
            return state(Output.of(state));
        }

        /**
         * @param ttl Input only. The time to live for this Consent from when it is created.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<String> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl Input only. The time to live for this Consent from when it is created.
         * 
         * @return builder
         * 
         */
        public Builder ttl(String ttl) {
            return ttl(Output.of(ttl));
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

        public ConsentArgs build() {
            $.consentArtifact = Objects.requireNonNull($.consentArtifact, "expected parameter 'consentArtifact' to be non-null");
            $.consentStoreId = Objects.requireNonNull($.consentStoreId, "expected parameter 'consentStoreId' to be non-null");
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
