// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * OwnerReference contains enough information to let you identify an owning object. Currently, an owning object must be in the same namespace, so there is no namespace field.
 * 
 */
public final class OwnerReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OwnerReferenceArgs Empty = new OwnerReferenceArgs();

    /**
     * API version of the referent.
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return API version of the referent.
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. +optional
     * 
     */
    @Import(name="blockOwnerDeletion")
    private @Nullable Output<Boolean> blockOwnerDeletion;

    /**
     * @return If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. +optional
     * 
     */
    public Optional<Output<Boolean>> blockOwnerDeletion() {
        return Optional.ofNullable(this.blockOwnerDeletion);
    }

    /**
     * If true, this reference points to the managing controller. +optional
     * 
     */
    @Import(name="controller")
    private @Nullable Output<Boolean> controller;

    /**
     * @return If true, this reference points to the managing controller. +optional
     * 
     */
    public Optional<Output<Boolean>> controller() {
        return Optional.ofNullable(this.controller);
    }

    /**
     * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the referent. More info: https://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the referent. More info: https://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * UID of the referent. More info: https://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return UID of the referent. More info: https://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private OwnerReferenceArgs() {}

    private OwnerReferenceArgs(OwnerReferenceArgs $) {
        this.apiVersion = $.apiVersion;
        this.blockOwnerDeletion = $.blockOwnerDeletion;
        this.controller = $.controller;
        this.kind = $.kind;
        this.name = $.name;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OwnerReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OwnerReferenceArgs $;

        public Builder() {
            $ = new OwnerReferenceArgs();
        }

        public Builder(OwnerReferenceArgs defaults) {
            $ = new OwnerReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion API version of the referent.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion API version of the referent.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param blockOwnerDeletion If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. +optional
         * 
         * @return builder
         * 
         */
        public Builder blockOwnerDeletion(@Nullable Output<Boolean> blockOwnerDeletion) {
            $.blockOwnerDeletion = blockOwnerDeletion;
            return this;
        }

        /**
         * @param blockOwnerDeletion If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. +optional
         * 
         * @return builder
         * 
         */
        public Builder blockOwnerDeletion(Boolean blockOwnerDeletion) {
            return blockOwnerDeletion(Output.of(blockOwnerDeletion));
        }

        /**
         * @param controller If true, this reference points to the managing controller. +optional
         * 
         * @return builder
         * 
         */
        public Builder controller(@Nullable Output<Boolean> controller) {
            $.controller = controller;
            return this;
        }

        /**
         * @param controller If true, this reference points to the managing controller. +optional
         * 
         * @return builder
         * 
         */
        public Builder controller(Boolean controller) {
            return controller(Output.of(controller));
        }

        /**
         * @param kind Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the referent. More info: https://kubernetes.io/docs/user-guide/identifiers#names
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the referent. More info: https://kubernetes.io/docs/user-guide/identifiers#names
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param uid UID of the referent. More info: https://kubernetes.io/docs/user-guide/identifiers#uids
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid UID of the referent. More info: https://kubernetes.io/docs/user-guide/identifiers#uids
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public OwnerReferenceArgs build() {
            return $;
        }
    }

}
