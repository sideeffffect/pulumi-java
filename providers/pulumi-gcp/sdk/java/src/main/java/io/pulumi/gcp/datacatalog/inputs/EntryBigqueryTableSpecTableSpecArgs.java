// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryBigqueryTableSpecTableSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryBigqueryTableSpecTableSpecArgs Empty = new EntryBigqueryTableSpecTableSpecArgs();

    @InputImport(name="groupedEntry")
      private final @Nullable Input<String> groupedEntry;

    public Input<String> getGroupedEntry() {
        return this.groupedEntry == null ? Input.empty() : this.groupedEntry;
    }

    public EntryBigqueryTableSpecTableSpecArgs(@Nullable Input<String> groupedEntry) {
        this.groupedEntry = groupedEntry;
    }

    private EntryBigqueryTableSpecTableSpecArgs() {
        this.groupedEntry = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryBigqueryTableSpecTableSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> groupedEntry;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryBigqueryTableSpecTableSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupedEntry = defaults.groupedEntry;
        }

        public Builder groupedEntry(@Nullable Input<String> groupedEntry) {
            this.groupedEntry = groupedEntry;
            return this;
        }

        public Builder groupedEntry(@Nullable String groupedEntry) {
            this.groupedEntry = Input.ofNullable(groupedEntry);
            return this;
        }
        public EntryBigqueryTableSpecTableSpecArgs build() {
            return new EntryBigqueryTableSpecTableSpecArgs(groupedEntry);
        }
    }
}
