// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.customerprofiles.inputs;

import com.pulumi.awsnative.customerprofiles.inputs.ObjectTypeFieldArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectTypeFieldMapArgs extends ResourceArgs {

    public static final ObjectTypeFieldMapArgs Empty = new ObjectTypeFieldMapArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="objectTypeField")
    private @Nullable Output<ObjectTypeFieldArgs> objectTypeField;

    public Optional<Output<ObjectTypeFieldArgs>> objectTypeField() {
        return Optional.ofNullable(this.objectTypeField);
    }

    private ObjectTypeFieldMapArgs() {}

    private ObjectTypeFieldMapArgs(ObjectTypeFieldMapArgs $) {
        this.name = $.name;
        this.objectTypeField = $.objectTypeField;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectTypeFieldMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectTypeFieldMapArgs $;

        public Builder() {
            $ = new ObjectTypeFieldMapArgs();
        }

        public Builder(ObjectTypeFieldMapArgs defaults) {
            $ = new ObjectTypeFieldMapArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder objectTypeField(@Nullable Output<ObjectTypeFieldArgs> objectTypeField) {
            $.objectTypeField = objectTypeField;
            return this;
        }

        public Builder objectTypeField(ObjectTypeFieldArgs objectTypeField) {
            return objectTypeField(Output.of(objectTypeField));
        }

        public ObjectTypeFieldMapArgs build() {
            return $;
        }
    }

}
