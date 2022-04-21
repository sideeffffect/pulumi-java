// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs extends com.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs Empty = new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs();

    @Import(name="items")
    private @Nullable Output<List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs>> items;

    public Optional<Output<List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    private FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs() {}

    private FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs $;

        public Builder() {
            $ = new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs();
        }

        public Builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs defaults) {
            $ = new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs(Objects.requireNonNull(defaults));
        }

        public Builder items(@Nullable Output<List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs> items) {
            return items(Output.of(items));
        }

        public Builder items(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs... items) {
            return items(List.of(items));
        }

        public FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs build() {
            return $;
        }
    }

}
