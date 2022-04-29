// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firestore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DocumentState extends ResourceArgs {

    public static final DocumentState Empty = new DocumentState();

    /**
     * The collection ID, relative to database. For example: chatrooms or chatrooms/my-document/private-messages.
     * 
     */
    @Import(name="collection")
    private @Nullable Output<String> collection;

    /**
     * @return The collection ID, relative to database. For example: chatrooms or chatrooms/my-document/private-messages.
     * 
     */
    public Optional<Output<String>> collection() {
        return Optional.ofNullable(this.collection);
    }

    /**
     * Creation timestamp in RFC3339 format.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Creation timestamp in RFC3339 format.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
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
    @Import(name="documentId")
    private @Nullable Output<String> documentId;

    /**
     * @return The client-assigned document ID to use for this document during creation.
     * 
     */
    public Optional<Output<String>> documentId() {
        return Optional.ofNullable(this.documentId);
    }

    /**
     * The document&#39;s [fields](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents) formated as a json string.
     * 
     */
    @Import(name="fields")
    private @Nullable Output<String> fields;

    /**
     * @return The document&#39;s [fields](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents) formated as a json string.
     * 
     */
    public Optional<Output<String>> fields() {
        return Optional.ofNullable(this.fields);
    }

    /**
     * A server defined name for this index. Format:
     * &#39;projects/{{project_id}}/databases/{{database_id}}/documents/{{path}}/{{document_id}}&#39;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A server defined name for this index. Format:
     * &#39;projects/{{project_id}}/databases/{{database_id}}/documents/{{path}}/{{document_id}}&#39;
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A relative path to the collection this document exists within
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return A relative path to the collection this document exists within
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
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

    /**
     * Last update timestamp in RFC3339 format.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Last update timestamp in RFC3339 format.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private DocumentState() {}

    private DocumentState(DocumentState $) {
        this.collection = $.collection;
        this.createTime = $.createTime;
        this.database = $.database;
        this.documentId = $.documentId;
        this.fields = $.fields;
        this.name = $.name;
        this.path = $.path;
        this.project = $.project;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentState $;

        public Builder() {
            $ = new DocumentState();
        }

        public Builder(DocumentState defaults) {
            $ = new DocumentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param collection The collection ID, relative to database. For example: chatrooms or chatrooms/my-document/private-messages.
         * 
         * @return builder
         * 
         */
        public Builder collection(@Nullable Output<String> collection) {
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
         * @param createTime Creation timestamp in RFC3339 format.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Creation timestamp in RFC3339 format.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
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
        public Builder documentId(@Nullable Output<String> documentId) {
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
        public Builder fields(@Nullable Output<String> fields) {
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
         * @param name A server defined name for this index. Format:
         * &#39;projects/{{project_id}}/databases/{{database_id}}/documents/{{path}}/{{document_id}}&#39;
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A server defined name for this index. Format:
         * &#39;projects/{{project_id}}/databases/{{database_id}}/documents/{{path}}/{{document_id}}&#39;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path A relative path to the collection this document exists within
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path A relative path to the collection this document exists within
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
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

        /**
         * @param updateTime Last update timestamp in RFC3339 format.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Last update timestamp in RFC3339 format.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public DocumentState build() {
            return $;
        }
    }

}
