// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryState extends ResourceArgs {

    public static final RepositoryState Empty = new RepositoryState();

    /**
     * The time when the repository was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time when the repository was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The user-provided description of the repository.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The user-provided description of the repository.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The format of packages that are stored in the repository. You can only create
     * alpha formats if you are a member of the [alpha user group](https://cloud.google.com/artifact-registry/docs/supported-formats#alpha-access).
     * - DOCKER
     * - MAVEN ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - NPM ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - PYTHON ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - APT ([alpha](https://cloud.google.com/products#product-launch-stages))
     * - YUM ([alpha](https://cloud.google.com/products#product-launch-stages))
     * - HELM ([alpha](https://cloud.google.com/products#product-launch-stages))
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return The format of packages that are stored in the repository. You can only create
     * alpha formats if you are a member of the [alpha user group](https://cloud.google.com/artifact-registry/docs/supported-formats#alpha-access).
     * - DOCKER
     * - MAVEN ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - NPM ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - PYTHON ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - APT ([alpha](https://cloud.google.com/products#product-launch-stages))
     * - YUM ([alpha](https://cloud.google.com/products#product-launch-stages))
     * - HELM ([alpha](https://cloud.google.com/products#product-launch-stages))
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The Cloud KMS resource name of the customer managed encryption key that’s
     * used to encrypt the contents of the Repository. Has the form:
     * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
     * This value may not be changed after the Repository has been created.
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return The Cloud KMS resource name of the customer managed encryption key that’s
     * used to encrypt the contents of the Repository. Has the form:
     * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
     * This value may not be changed after the Repository has been created.
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * Labels with user-defined metadata.
     * This field may contain up to 64 entries. Label keys and values may be no
     * longer than 63 characters. Label keys must begin with a lowercase letter
     * and may only contain lowercase letters, numeric characters, underscores,
     * and dashes.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels with user-defined metadata.
     * This field may contain up to 64 entries. Label keys and values may be no
     * longer than 63 characters. Label keys must begin with a lowercase letter
     * and may only contain lowercase letters, numeric characters, underscores,
     * and dashes.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the location this repository is located in.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The name of the location this repository is located in.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the repository, for example: &#34;projects/p1/locations/us-central1/repositories/repo1&#34;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the repository, for example: &#34;projects/p1/locations/us-central1/repositories/repo1&#34;
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * The last part of the repository name, for example:
     * &#34;repo1&#34;
     * 
     */
    @Import(name="repositoryId")
    private @Nullable Output<String> repositoryId;

    /**
     * @return The last part of the repository name, for example:
     * &#34;repo1&#34;
     * 
     */
    public Optional<Output<String>> repositoryId() {
        return Optional.ofNullable(this.repositoryId);
    }

    /**
     * The time when the repository was last updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The time when the repository was last updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private RepositoryState() {}

    private RepositoryState(RepositoryState $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.format = $.format;
        this.kmsKeyName = $.kmsKeyName;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.repositoryId = $.repositoryId;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryState $;

        public Builder() {
            $ = new RepositoryState();
        }

        public Builder(RepositoryState defaults) {
            $ = new RepositoryState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The time when the repository was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time when the repository was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description The user-provided description of the repository.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The user-provided description of the repository.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param format The format of packages that are stored in the repository. You can only create
         * alpha formats if you are a member of the [alpha user group](https://cloud.google.com/artifact-registry/docs/supported-formats#alpha-access).
         * - DOCKER
         * - MAVEN ([Preview](https://cloud.google.com/products#product-launch-stages))
         * - NPM ([Preview](https://cloud.google.com/products#product-launch-stages))
         * - PYTHON ([Preview](https://cloud.google.com/products#product-launch-stages))
         * - APT ([alpha](https://cloud.google.com/products#product-launch-stages))
         * - YUM ([alpha](https://cloud.google.com/products#product-launch-stages))
         * - HELM ([alpha](https://cloud.google.com/products#product-launch-stages))
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The format of packages that are stored in the repository. You can only create
         * alpha formats if you are a member of the [alpha user group](https://cloud.google.com/artifact-registry/docs/supported-formats#alpha-access).
         * - DOCKER
         * - MAVEN ([Preview](https://cloud.google.com/products#product-launch-stages))
         * - NPM ([Preview](https://cloud.google.com/products#product-launch-stages))
         * - PYTHON ([Preview](https://cloud.google.com/products#product-launch-stages))
         * - APT ([alpha](https://cloud.google.com/products#product-launch-stages))
         * - YUM ([alpha](https://cloud.google.com/products#product-launch-stages))
         * - HELM ([alpha](https://cloud.google.com/products#product-launch-stages))
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param kmsKeyName The Cloud KMS resource name of the customer managed encryption key that’s
         * used to encrypt the contents of the Repository. Has the form:
         * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
         * This value may not be changed after the Repository has been created.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName The Cloud KMS resource name of the customer managed encryption key that’s
         * used to encrypt the contents of the Repository. Has the form:
         * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
         * This value may not be changed after the Repository has been created.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        /**
         * @param labels Labels with user-defined metadata.
         * This field may contain up to 64 entries. Label keys and values may be no
         * longer than 63 characters. Label keys must begin with a lowercase letter
         * and may only contain lowercase letters, numeric characters, underscores,
         * and dashes.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels with user-defined metadata.
         * This field may contain up to 64 entries. Label keys and values may be no
         * longer than 63 characters. Label keys must begin with a lowercase letter
         * and may only contain lowercase letters, numeric characters, underscores,
         * and dashes.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The name of the location this repository is located in.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The name of the location this repository is located in.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the repository, for example: &#34;projects/p1/locations/us-central1/repositories/repo1&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the repository, for example: &#34;projects/p1/locations/us-central1/repositories/repo1&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param repositoryId The last part of the repository name, for example:
         * &#34;repo1&#34;
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(@Nullable Output<String> repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        /**
         * @param repositoryId The last part of the repository name, for example:
         * &#34;repo1&#34;
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(String repositoryId) {
            return repositoryId(Output.of(repositoryId));
        }

        /**
         * @param updateTime The time when the repository was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The time when the repository was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public RepositoryState build() {
            return $;
        }
    }

}
