// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs Empty = new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs();

    @Import(name="items")
      private final @Nullable Output<List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs>> items;

    public Output<List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs>> items() {
        return this.items == null ? Codegen.empty() : this.items;
    }

    public FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs(@Nullable Output<List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs>> items) {
        this.items = items;
    }

    private FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs() {
        this.items = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(@Nullable Output<List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs>> items) {
            this.items = items;
            return this;
        }
        public Builder items(@Nullable List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs> items) {
            this.items = Codegen.ofNullable(items);
            return this;
        }
        public Builder items(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs... items) {
            return items(List.of(items));
        }        public FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs build() {
            return new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesGetArgs(items);
        }
    }
}
