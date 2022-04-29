// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firestore;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DocumentArgs extends ResourceArgs {

    public static final DocumentArgs Empty = new DocumentArgs();

    /**
     * The collection ID, relative to database. For example: chatrooms or chatrooms/my-document/private-messages.
     * 
     */
    @Import(name="collection", required=true)
    private Output<String> collection;

    /**
     * @return The collection ID, relative to database. For example: chatrooms or chatrooms/my-document/private-messages.
     * 
     */
    public Output<String> collection() {
        return this.collection;
    }

    /**
     * The Firestore database id. Defaults to `&#34;(default)&#34;`.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The Firestore database id. Defaults to `&#34;(default)&#34;`.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * The client-assigned document ID to use for this document during creation.
     * 
     */
    @Import(name="documentId", required=true)
    private Output<String> documentId;

    /**
     * @return The client-assigned document ID to use for this document during creation.
     * 
     */
    public Output<String> documentId() {
        return this.documentId;
    }

    /**
     * The document&#39;s [fields](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents) formated as a json string.
     * 
     */
    @Import(name="fields", required=true)
    private Output<String> fields;

    /**
     * @return The document&#39;s [fields](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents) formated as a json string.
     * 
     */
    public Output<String> fields() {
        return this.fields;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private DocumentArgs() {}

    private DocumentArgs(DocumentArgs $) {
        this.collection = $.collection;
        this.database = $.database;
        this.documentId = $.documentId;
        this.fields = $.fields;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentArgs $;

        public Builder() {
            $ = new DocumentArgs();
        }

        public Builder(DocumentArgs defaults) {
            $ = new DocumentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param collection The collection ID, relative to database. For example: chatrooms or chatrooms/my-document/private-messages.
         * 
         * @return builder
         * 
         */
        public Builder collection(Output<String> collection) {
            $.collection = collection;
            return this;
        }

        /**
         * @param collection The collection ID, relative to database. For example: chatrooms or chatrooms/my-document/private-messages.
         * 
         * @return builder
         * 
         */
        public Builder collection(String collection) {
            return collection(Output.of(collection));
        }

        /**
         * @param database The Firestore database id. Defaults to `&#34;(default)&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The Firestore database id. Defaults to `&#34;(default)&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param documentId The client-assigned document ID to use for this document during creation.
         * 
         * @return builder
         * 
         */
        public Builder documentId(Output<String> documentId) {
            $.documentId = documentId;
            return this;
        }

        /**
         * @param documentId The client-assigned document ID to use for this document during creation.
         * 
         * @return builder
         * 
         */
        public Builder documentId(String documentId) {
            return documentId(Output.of(documentId));
        }

        /**
         * @param fields The document&#39;s [fields](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents) formated as a json string.
         * 
         * @return builder
         * 
         */
        public Builder fields(Output<String> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields The document&#39;s [fields](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents) formated as a json string.
         * 
         * @return builder
         * 
         */
        public Builder fields(String fields) {
            return fields(Output.of(fields));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public DocumentArgs build() {
            $.collection = Objects.requireNonNull($.collection, "expected parameter 'collection' to be non-null");
            $.documentId = Objects.requireNonNull($.documentId, "expected parameter 'documentId' to be non-null");
            $.fields = Objects.requireNonNull($.fields, "expected parameter 'fields' to be non-null");
            return $;
        }
    }

}
