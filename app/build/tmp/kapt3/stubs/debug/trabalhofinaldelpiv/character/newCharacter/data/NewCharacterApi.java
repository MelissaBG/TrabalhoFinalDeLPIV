package trabalhofinaldelpiv.character.newCharacter.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Ltrabalhofinaldelpiv/character/newCharacter/data/NewCharacterApi;", "", "saveNewCharacter", "Lretrofit2/Response;", "", "userId", "", "character", "Ltrabalhofinaldelpiv/character/newCharacter/data/CharacterRequest;", "(ILtrabalhofinaldelpiv/character/newCharacter/data/CharacterRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NewCharacterApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "api/character/{userId}")
    public abstract java.lang.Object saveNewCharacter(@retrofit2.http.Path(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    trabalhofinaldelpiv.character.newCharacter.data.CharacterRequest character, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> continuation);
}