// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs Empty = new FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs();

    @Import(name="items")
    private @Nullable Output<List<String>> items;

    public Optional<Output<List<String>>> items() {
        return Optional.ofNullable(this.items);
    }

    private FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs() {}

    private FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs(FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs $;

        public Builder() {
            $ = new FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs();
        }

        public Builder(FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs defaults) {
            $ = new FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder items(@Nullable Output<List<String>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<String> items) {
            return items(Output.of(items));
        }

        public Builder items(String... items) {
            return items(List.of(items));
        }

        public FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs build() {
            return $;
        }
    }

}
