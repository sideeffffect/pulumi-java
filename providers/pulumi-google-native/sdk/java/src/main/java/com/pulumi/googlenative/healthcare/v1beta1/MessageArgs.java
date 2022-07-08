// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare.v1beta1.inputs.PatientIdArgs;
import com.pulumi.googlenative.healthcare.v1beta1.inputs.SchematizedDataArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MessageArgs extends com.pulumi.resources.ResourceArgs {

    public static final MessageArgs Empty = new MessageArgs();

    /**
     * Raw message bytes.
     * 
     */
    @Import(name="data")
    private @Nullable Output<String> data;

    /**
     * @return Raw message bytes.
     * 
     */
    public Optional<Output<String>> data() {
        return Optional.ofNullable(this.data);
    }

    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    @Import(name="hl7V2StoreId", required=true)
    private Output<String> hl7V2StoreId;

    public Output<String> hl7V2StoreId() {
        return this.hl7V2StoreId;
    }

    /**
     * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The message type for this message. MSH-9.1.
     * 
     */
    @Import(name="messageType")
    private @Nullable Output<String> messageType;

    /**
     * @return The message type for this message. MSH-9.1.
     * 
     */
    public Optional<Output<String>> messageType() {
        return Optional.ofNullable(this.messageType);
    }

    /**
     * Resource name of the Message, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name of the Message, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
     * 
     */
    @Import(name="patientIds")
    private @Nullable Output<List<PatientIdArgs>> patientIds;

    /**
     * @return All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
     * 
     */
    public Optional<Output<List<PatientIdArgs>>> patientIds() {
        return Optional.ofNullable(this.patientIds);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The parsed version of the raw message data schematized according to this store&#39;s schemas and type definitions.
     * 
     */
    @Import(name="schematizedData")
    private @Nullable Output<SchematizedDataArgs> schematizedData;

    /**
     * @return The parsed version of the raw message data schematized according to this store&#39;s schemas and type definitions.
     * 
     */
    public Optional<Output<SchematizedDataArgs>> schematizedData() {
        return Optional.ofNullable(this.schematizedData);
    }

    /**
     * The hospital that this message came from. MSH-4.
     * 
     */
    @Import(name="sendFacility")
    private @Nullable Output<String> sendFacility;

    /**
     * @return The hospital that this message came from. MSH-4.
     * 
     */
    public Optional<Output<String>> sendFacility() {
        return Optional.ofNullable(this.sendFacility);
    }

    /**
     * The datetime the sending application sent this message. MSH-7.
     * 
     */
    @Import(name="sendTime")
    private @Nullable Output<String> sendTime;

    /**
     * @return The datetime the sending application sent this message. MSH-7.
     * 
     */
    public Optional<Output<String>> sendTime() {
        return Optional.ofNullable(this.sendTime);
    }

    private MessageArgs() {}

    private MessageArgs(MessageArgs $) {
        this.data = $.data;
        this.datasetId = $.datasetId;
        this.hl7V2StoreId = $.hl7V2StoreId;
        this.labels = $.labels;
        this.location = $.location;
        this.messageType = $.messageType;
        this.name = $.name;
        this.patientIds = $.patientIds;
        this.project = $.project;
        this.schematizedData = $.schematizedData;
        this.sendFacility = $.sendFacility;
        this.sendTime = $.sendTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MessageArgs $;

        public Builder() {
            $ = new MessageArgs();
        }

        public Builder(MessageArgs defaults) {
            $ = new MessageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param data Raw message bytes.
         * 
         * @return builder
         * 
         */
        public Builder data(@Nullable Output<String> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data Raw message bytes.
         * 
         * @return builder
         * 
         */
        public Builder data(String data) {
            return data(Output.of(data));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        public Builder hl7V2StoreId(Output<String> hl7V2StoreId) {
            $.hl7V2StoreId = hl7V2StoreId;
            return this;
        }

        public Builder hl7V2StoreId(String hl7V2StoreId) {
            return hl7V2StoreId(Output.of(hl7V2StoreId));
        }

        /**
         * @param labels User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param messageType The message type for this message. MSH-9.1.
         * 
         * @return builder
         * 
         */
        public Builder messageType(@Nullable Output<String> messageType) {
            $.messageType = messageType;
            return this;
        }

        /**
         * @param messageType The message type for this message. MSH-9.1.
         * 
         * @return builder
         * 
         */
        public Builder messageType(String messageType) {
            return messageType(Output.of(messageType));
        }

        /**
         * @param name Resource name of the Message, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name of the Message, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param patientIds All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
         * 
         * @return builder
         * 
         */
        public Builder patientIds(@Nullable Output<List<PatientIdArgs>> patientIds) {
            $.patientIds = patientIds;
            return this;
        }

        /**
         * @param patientIds All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
         * 
         * @return builder
         * 
         */
        public Builder patientIds(List<PatientIdArgs> patientIds) {
            return patientIds(Output.of(patientIds));
        }

        /**
         * @param patientIds All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
         * 
         * @return builder
         * 
         */
        public Builder patientIds(PatientIdArgs... patientIds) {
            return patientIds(List.of(patientIds));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param schematizedData The parsed version of the raw message data schematized according to this store&#39;s schemas and type definitions.
         * 
         * @return builder
         * 
         */
        public Builder schematizedData(@Nullable Output<SchematizedDataArgs> schematizedData) {
            $.schematizedData = schematizedData;
            return this;
        }

        /**
         * @param schematizedData The parsed version of the raw message data schematized according to this store&#39;s schemas and type definitions.
         * 
         * @return builder
         * 
         */
        public Builder schematizedData(SchematizedDataArgs schematizedData) {
            return schematizedData(Output.of(schematizedData));
        }

        /**
         * @param sendFacility The hospital that this message came from. MSH-4.
         * 
         * @return builder
         * 
         */
        public Builder sendFacility(@Nullable Output<String> sendFacility) {
            $.sendFacility = sendFacility;
            return this;
        }

        /**
         * @param sendFacility The hospital that this message came from. MSH-4.
         * 
         * @return builder
         * 
         */
        public Builder sendFacility(String sendFacility) {
            return sendFacility(Output.of(sendFacility));
        }

        /**
         * @param sendTime The datetime the sending application sent this message. MSH-7.
         * 
         * @return builder
         * 
         */
        public Builder sendTime(@Nullable Output<String> sendTime) {
            $.sendTime = sendTime;
            return this;
        }

        /**
         * @param sendTime The datetime the sending application sent this message. MSH-7.
         * 
         * @return builder
         * 
         */
        public Builder sendTime(String sendTime) {
            return sendTime(Output.of(sendTime));
        }

        public MessageArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.hl7V2StoreId = Objects.requireNonNull($.hl7V2StoreId, "expected parameter 'hl7V2StoreId' to be non-null");
            return $;
        }
    }

}
