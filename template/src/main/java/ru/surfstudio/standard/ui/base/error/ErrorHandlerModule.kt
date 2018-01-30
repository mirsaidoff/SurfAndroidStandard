package ru.surfstudio.standard.ui.base.error

import dagger.Module
import dagger.Provides
import ru.surfstudio.android.core.ui.base.error.ErrorHandler
import ru.surfstudio.android.dagger.scope.PerScreen

@Module
class ErrorHandlerModule {

    @Provides
    @PerScreen
    internal fun provideNetworkErrorHandler(standardErrorHandler: StandardErrorHandler): ErrorHandler {
        return standardErrorHandler
    }
}
