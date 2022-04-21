// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Deployment Manager will call these methods during the events of creation/deletion/update/get/setIamPolicy
 * 
 */
public final class MethodMapArgs extends com.pulumi.resources.ResourceArgs {

    public static final MethodMapArgs Empty = new MethodMapArgs();

    /**
     * The action identifier for the create method to be used for this collection
     * 
     */
    @Import(name="create")
    private @Nullable Output<String> create;

    public Optional<Output<String>> create() {
        return Optional.ofNullable(this.create);
    }

    /**
     * The action identifier for the delete method to be used for this collection
     * 
     */
    @Import(name="delete")
    private @Nullable Output<String> delete;

    public Optional<Output<String>> delete() {
        return Optional.ofNullable(this.delete);
    }

    /**
     * The action identifier for the get method to be used for this collection
     * 
     */
    @Import(name="get")
    private @Nullable Output<String> get;

    public Optional<Output<String>> get() {
        return Optional.ofNullable(this.get);
    }

    /**
     * The action identifier for the setIamPolicy method to be used for this collection
     * 
     */
    @Import(name="setIamPolicy")
    private @Nullable Output<String> setIamPolicy;

    public Optional<Output<String>> setIamPolicy() {
        return Optional.ofNullable(this.setIamPolicy);
    }

    /**
     * The action identifier for the update method to be used for this collection
     * 
     */
    @Import(name="update")
    private @Nullable Output<String> update;

    public Optional<Output<String>> update() {
        return Optional.ofNullable(this.update);
    }

    private MethodMapArgs() {}

    private MethodMapArgs(MethodMapArgs $) {
        this.create = $.create;
        this.delete = $.delete;
        this.get = $.get;
        this.setIamPolicy = $.setIamPolicy;
        this.update = $.update;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MethodMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MethodMapArgs $;

        public Builder() {
            $ = new MethodMapArgs();
        }

        public Builder(MethodMapArgs defaults) {
            $ = new MethodMapArgs(Objects.requireNonNull(defaults));
        }

        public Builder create(@Nullable Output<String> create) {
            $.create = create;
            return this;
        }

        public Builder create(String create) {
            return create(Output.of(create));
        }

        public Builder delete(@Nullable Output<String> delete) {
            $.delete = delete;
            return this;
        }

        public Builder delete(String delete) {
            return delete(Output.of(delete));
        }

        public Builder get(@Nullable Output<String> get) {
            $.get = get;
            return this;
        }

        public Builder get(String get) {
            return get(Output.of(get));
        }

        public Builder setIamPolicy(@Nullable Output<String> setIamPolicy) {
            $.setIamPolicy = setIamPolicy;
            return this;
        }

        public Builder setIamPolicy(String setIamPolicy) {
            return setIamPolicy(Output.of(setIamPolicy));
        }

        public Builder update(@Nullable Output<String> update) {
            $.update = update;
            return this;
        }

        public Builder update(String update) {
            return update(Output.of(update));
        }

        public MethodMapArgs build() {
            return $;
        }
    }

}
